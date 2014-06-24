package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import models.Ringtone;
import play.data.Form;
import java.util.List;
import play.libs.Json;
import play.db.ebean.Model;

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
}
