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
    public String urlLogo;
    public String urlProduct;
    public int logoWidth;
    public int logoHeight;
    public int productWidth;
    public int productHeight;


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
     * Get category.
     *
     * @return category as String.
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
     * Get urlLogo.
     *
     * @return urlLogo as String.
     */
    public String getUrlLogo()
    {
        return urlLogo;
    }

    /**
     * Set urlLogo.
     *
     * @param urlLogo the value to set.
     */
    public void setUrlLogo(String urlLogo)
    {
        this.urlLogo = urlLogo;
    }

    /**
     * Get urlProduct.
     *
     * @return urlProduct as String.
     */
    public String getUrlProduct()
    {
        return urlProduct;
    }

    /**
     * Set urlProduct.
     *
     * @param urlProduct the value to set.
     */
    public void setUrlProduct(String urlProduct)
    {
        this.urlProduct = urlProduct;
    }

    /**
     * Get logoWidth.
     *
     * @return logoWidth as int.
     */
    public int getLogoWidth()
    {
        return logoWidth;
    }

    /**
     * Set logoWidth.
     *
     * @param logoWidth the value to set.
     */
    public void setLogoWidth(int logoWidth)
    {
        this.logoWidth = logoWidth;
    }

    /**
     * Get logoHeight.
     *
     * @return logoHeight as int.
     */
    public int getLogoHeight()
    {
        return logoHeight;
    }

    /**
     * Set logoHeight.
     *
     * @param logoHeight the value to set.
     */
    public void setLogoHeight(int logoHeight)
    {
        this.logoHeight = logoHeight;
    }

    /**
     * Get productWidth.
     *
     * @return productWidth as int.
     */
    public int getProductWidth()
    {
        return productWidth;
    }

    /**
     * Set productWidth.
     *
     * @param productWidth the value to set.
     */
    public void setProductWidth(int productWidth)
    {
        this.productWidth = productWidth;
    }

    /**
     * Get productHeight.
     *
     * @return productHeight as int.
     */
    public int getProductHeight()
    {
        return productHeight;
    }

    /**
     * Set productHeight.
     *
     * @param productHeight the value to set.
     */
    public void setProductHeight(int productHeight)
    {
        this.productHeight = productHeight;
    }
}
