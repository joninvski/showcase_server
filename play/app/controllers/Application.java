package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import models.Thing;
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

    public static Result addThing() {
        Thing thing =  Form.form(Thing.class).bindFromRequest().get();
        thing.save();
        return redirect(routes.Application.index());
    }

    public static void addThing(String name, String uri, String category) {
        Thing thing =   new Thing();
        thing.setName(name);
        thing.setUri(uri);
        thing.setCategory(category);
        thing.save();
    }

    public static Result getThings() {
        List<Thing> things = new Model.Finder(Long.class, Thing.class).all();
        return ok(Json.toJson(things));
    }

    public static Result getEvents() {
        List<Event> events = new Model.Finder(Long.class, Event.class).all();
        return ok(Json.toJson(events));
    }

    public static class ResponseCode {

        public ResponseCode(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        int code;
        String desc;
    }


    @BodyParser.Of(BodyParser.Json.class)
    public static Result insertEvent() {
        JsonNode json = request().body().asJson();
        Event e = Json.fromJson(json, Event.class);
        e.save();
        Integer duration = json.findPath("duration").intValue();
        Boolean answered = json.findPath("duration").booleanValue();

        if(duration == null || answered == null) {
            return badRequest(Json.toJson(new ResponseCode(400, "Missing parameter [name or answered]")));
        } else {
            return ok(Json.toJson(new ResponseCode(200, "Ok")));
        }
    }
}
