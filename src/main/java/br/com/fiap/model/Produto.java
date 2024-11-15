package br.com.fiap.model;

import com.opencsv.bean.CsvBindByName;

import java.math.BigDecimal;

public class Produto {

    @CsvBindByName(column = "ProductId" , required = true)
    private int id;
    @CsvBindByName(column = "ProductName" , required = true)
    private String name;
    @CsvBindByName(column = "Description" , required = true)
    private String description;
    @CsvBindByName(column = "Price" , required = true)
    private BigDecimal price;
    @CsvBindByName(column = "Category" , required = true)
    private String category;

    public int getId() {
        return id;
    }

    public Produto setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Produto setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Produto setDescription(String description) {
        this.description = description;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Produto setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Produto setCategory(String category) {
        this.category = category;
        return this;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
