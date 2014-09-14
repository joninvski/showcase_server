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
    public String text;
    public String homepage;
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

    /**
     * Get homepage.
     *
     * @return homepage as String.
     */
    public String getHomepage()
    {
        return homepage;
    }

    /**
     * Set homepage.
     *
     * @param homepage the value to set.
     */
    public void setHomepage(String homepage)
    {
        this.homepage = homepage;
    }

    /**
     * Get text.
     *
     * @return text as String.
     */
    public String getText()
    {
        return text;
    }

    /**
     * Set text.
     *
     * @param text the value to set.
     */
    public void setText(String text)
    {
        this.text = text;
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
