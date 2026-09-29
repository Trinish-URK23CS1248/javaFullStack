package com.stringlist;
import java.util.ArrayList;
import java.util.List;
public class StringList {
    private List<String> list = new ArrayList<>();
    public void insert(String item) {
        list.add(item);
        System.out.println("Inserted successfully");
    }
    public void search(String item) {
        if (list.contains(item)) {
            System.out.println("Item found in the list.");
        } else {
            System.out.println("Item does not exist.");
        }
    }
    public void delete(String item) {
        if (list.remove(item)) {
            System.out.println("Deleted successfully");
        } else {
            System.out.println("Item does not exist.");
        }
    }

    public void display() {
        System.out.println("The Items in the list are:");

        for (String item : list) {
            System.out.println(item);
        }
    }
}