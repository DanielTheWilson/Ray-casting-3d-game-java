/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grocerystoreproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {
        Item[] initialInventory = new Item[]{
            new Item("Apple", Category.FRUITS, 0.99),
            new Item("Carrot", Category.VEGETABLES, 1.49),
            new Item("Milk", Category.DAIRY, 2.99),
            new Item("Bread", Category.BAKERY, 3.49),
            new Item("Chicken", Category.MEAT, 4.99)
        };

            ArrayList<Item> inventory = new ArrayList<>(Arrays.asList(initialInventory));
                Scanner scanner = new Scanner(System.in);
                scanner.useLocale(Locale.US);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display all items");
            System.out.println("2. Add a new item");
            System.out.println("3. Remove an item by name");
            System.out.println("4. Display items by category");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

          switch (choice) {
            case 1:
                    displayAllItems(inventory);
                    break;
            
            case 2:
                System.out.print("Enter item name: ");
                String name = scanner.nextLine();
                System.out.print("Enter item category (FRUITS, VEGETABLES, DAIRY, BAKERY, MEAT): ");
                String categoryStr = scanner.nextLine().toUpperCase();
                Category category = Category.valueOf(categoryStr);
                System.out.print("Enter item price: ");
                    
                while (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a valid price: ");
                        scanner.next();
                    }
                    double price = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    addItem(inventory, new Item(name, category, price));
                    break;
                
            case 3:
                System.out.print("Enter the name of the item to remove: ");
                String nameToRemove = scanner.nextLine();
                removeItemByName(inventory, nameToRemove);
                 break;
                
            case 4:
                System.out.print("Enter the category to display (FRUITS, VEGETABLES, DAIRY, BAKERY, MEAT): ");
                String categoryToDisplay = scanner.nextLine().toUpperCase();
                Category displayCategory = Category.valueOf(categoryToDisplay);
                displayItemsByCategory(inventory, displayCategory);
                 break;
                
            case 5:
                System.out.println("Exiting program.");
                scanner.close();
                 return;
              default:
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void displayAllItems(ArrayList<Item> inventory) {
     for (Item item : inventory) {
          System.out.println(item);
        }
    }

    public static void addItem(ArrayList<Item> inventory, Item item) {
        inventory.add(item);
    }

    public static void removeItemByName(ArrayList<Item> inventory, String name) {
        inventory.removeIf(item -> item.getName().equalsIgnoreCase(name));
    }

    public static void displayItemsByCategory(ArrayList<Item> inventory, Category category) {
      for (Item item : inventory) {
       if (item.getCategory() == category) {
          System.out.println(item);
            }
        }
    }
}