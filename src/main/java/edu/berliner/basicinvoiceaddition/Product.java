package edu.berliner.basicinvoiceaddition;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity //no identifier specified for entity
public class Product {
    @NotNull
    @Size(min=2, max=30)
    private String name;
    @NotNull
    @Id
    private long id;
    @NotNull
    private double price;
    @NotNull
    @Size(min=2, max=50)
    private String description;

    public Product()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
