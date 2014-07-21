package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ringtone extends Model {

    @Id
    public String id;
    public String name;
    public String uri;
    public int price;
}
