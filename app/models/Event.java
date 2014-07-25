
package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Event extends Model {

    @Id
    public String id;

    public int duration;
    public String answered;
}
