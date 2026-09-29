package com.stringlist;
import java.util.Scanner;
public class StringListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringList stringList = new StringList();
        int choice;
        do {
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
            case 1:
                System.out.print("Enter the item to be inserted: ");
                String insertItem = sc.nextLine();
                stringList.insert(insertItem);
                break;
            case 2:
                System.out.print("Enter the item to search: ");
                String searchItem = sc.nextLine();
                stringList.search(searchItem);
                break;
            case 3:
                System.out.print("Enter the item to delete: ");
                String deleteItem = sc.nextLine();
                stringList.delete(deleteItem);
                break;
            case 4:
                stringList.display();
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid choice");
            }
        } while (choice != 5);
        sc.close();
    }
}