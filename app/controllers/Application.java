package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import models.Ringtone;
import models.Event;
import play.data.Form;
import java.util.List;
import play.libs.Json;
import play.db.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import play.mvc.BodyParser;


public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Teste."));
    }

    public static Result addRingtone() {
        Ringtone ring =  Form.form(Ringtone.class).bindFromRequest().get();
        ring.save();
        return redirect(routes.Application.index());
    }

    public static Result getRingtones() {
        List<Ringtone> rings = new Model.Finder(String.class, Ringtone.class).all();
        return ok(Json.toJson(rings));
    }

    public static Result getEvents() {
        List<Event> events = new Model.Finder(String.class, Event.class).all();
        return ok(Json.toJson(events));
    }


    @BodyParser.Of(BodyParser.Json.class)
    public static Result insertEvent() {
        JsonNode json = request().body().asJson();
        Event e = Json.fromJson(json, Event.class);
        e.save();
        String name = json.findPath("type").textValue();
        if(name == null) {
            return badRequest("Missing parameter [name]");
        } else {
            return ok("Hello " + e);
        }
    }
}
