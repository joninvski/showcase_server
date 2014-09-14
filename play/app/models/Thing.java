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
    public String uri;
    public int price;
    public int width;
    public int height;


    /**
     * Get id.
     *
     * @return id as long.
     */
    public long getId()
    {
        return id;
    }

    /**
     * Set id.
     *
     * @param id the value to set.
     */
    public void setId(long id)
    {
        this.id = id;
    }

    /**
     * Get name.
     *
     * @return name as String.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set name.
     *
     * @param name the value to set.
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Get uri.
     *
     * @return uri as String.
     */
    public String getUri()
    {
        return uri;
    }

    /**
     * Set uri.
     *
     * @param uri the value to set.
     */
    public void setUri(String uri)
    {
        this.uri = uri;
    }

    /**
     * Get price.
     *
     * @return price as int.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Set price.
     *
     * @param price the value to set.
     */
    public void setPrice(int price)
    {
        this.price = price;
    }

    /**
     * Get width.
     *
     * @return width as int.
     */
    public int getWidth()
    {
        return width;
    }

    /**
     * Set width.
     *
     * @param width the value to set.
     */
    public void setWidth(int width)
    {
        this.width = width;
    }

    /**
     * Get height.
     *
     * @return height as int.
     */
    public int getHeight()
    {
        return height;
    }

    /**
     * Set height.
     *
     * @param height the value to set.
     */
    public void setHeight(int height)
    {
        this.height = height;
    }
}
