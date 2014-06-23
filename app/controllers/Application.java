package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import models.*;
import models.Bar;
import play.data.Form;
import java.util.List;
import play.libs.Json;
import play.db.ebean.Model;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Teste."));
    }

    public static Result addBar() {
        Bar bar =  Form.form(Bar.class).bindFromRequest().get();
        bar.save();
        return redirect(routes.Application.index());
    }

    public static Result getBars() {
        List<Bar> bars = new Model.Finder(String.class, Bar.class).all();
        return ok(Json.toJson(bars));
    }
}
