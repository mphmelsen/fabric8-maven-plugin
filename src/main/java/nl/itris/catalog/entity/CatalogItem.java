package nl.itris.catalog.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by michael on 30-9-16.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "Item.findAll", query = "SELECT i FROM CatalogItem i"),
        @NamedQuery(name = "Item.findById", query = "SELECT i FROM CatalogItem i where i.id = :id")
})
@XmlRootElement
public class CatalogItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private int id;

    @Column(length=60)
    private String name;

    @Column
    private int type;

    @Column(length=100)
    private String description;

    public CatalogItem() { }

    public CatalogItem(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
