package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
public class Thing extends Model {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    public String name;
    public String text;
    public String category;
    public String homepage;
    public String logoUrl;
    public String imageUrl;
    public int logoWidth;
    public int logoHeight;
    public int urlWidth;
    public int urlHeight;

}
