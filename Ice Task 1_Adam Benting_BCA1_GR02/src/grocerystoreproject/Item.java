/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grocerystoreproject;

/**
 *
 * @author sapbe
 */
public class Item {
    private String name;
    private Category category;
    private double price;

    public Item(String name, Category category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" + "name: '" + name + '\'' + ", category: " + category + ", price: " + price + '}';
    }
}
