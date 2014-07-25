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

    public static void addRingtonePrivate(String name, String uri, int price) {
        Ringtone ring =   new Ringtone();
        ring.setName(name);
        ring.setUri(uri);
        ring.setPrice(price);
        ring.save();
    }

    public static Result getRingtones() {
        List<Ringtone> rings = new Model.Finder(String.class, Ringtone.class).all();
        if(rings.size() == 0) {
            addRingtonePrivate("Sumol", "http://www.hipersuper.pt/wp-content/uploads/2011/11/sumol.jpg", 123);
            addRingtonePrivate("Coca-Cola", "http://fandbnews.com/wp-content/uploads/2014/02/Coca-Cola-Logo.jpg", 231);
            addRingtonePrivate("Clube Joanense", "http://gallery.jhwebdesigner.com/wp-content/uploads/2012/08/mount_sinai_soccer_club_logo_300dpi_png_file.jpg", 93);
            addRingtonePrivate("Zara", "http://img4.wikia.nocookie.net/__cb20121226055648/logopedia/images/5/53/Zara-LOGO-blackwhite.jpg", 81);
            addRingtonePrivate("BCP", "http://4vector.com/thumb_data/afd-33897.jpg", 88);
            addRingtonePrivate("CGD", "http://images.all-free-download.com/images/graphiclarge/cgd_2_62577.jpg", 19);
            rings = new Model.Finder(String.class, Ringtone.class).all();
        }
        return ok(Json.toJson(rings));
    }

    public static Result getEvents() {
        List<Event> events = new Model.Finder(String.class, Event.class).all();
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
