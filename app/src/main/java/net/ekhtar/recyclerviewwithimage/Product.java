package net.ekhtar.recyclerviewwithimage;

/**
 * Created by mino on 18/10/2017.
 */

public class Product {
    private String name;
    private String price;
    private String brand;

    public Product() {
    }

    public Product(String name, String price, String brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
