package entities;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    private String name;
    private String type;
    private Date date_created;

    public Produit() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }


    public Produit(int ID, String name, String type, Date date_created) {
        this.ID = ID;
        this.name = name;
        this.type = type;
        this.date_created = date_created;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", date_created=" + date_created +
                '}';
    }
}
