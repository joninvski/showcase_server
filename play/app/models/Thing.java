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
    public String imageUrl;
    public String category;


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
     * Get imageUrl.
     *
     * @return imageUrl as String.
     */
    public String getImageUrl()
    {
        return imageUrl;
    }

    /**
     * Set imageUrl.
     *
     * @param imageUrl the value to set.
     */
    public void setImageUrl(String imageUrl)
    {
        this.imageUrl = imageUrl;
    }

    /**
     * Get category.
     *
     * @return category as string.
     */
    public String getCategory()
    {
        return category;
    }

    /**
     * Set category.
     *
     * @param category the value to set.
     */
    public void setCategory(String category)
    {
        this.category = category;
    }
}
