package Midterm;
import java.util.Scanner;
import java.util.ArrayList;

public class Midterm {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<String> userName = new ArrayList<>();
    public static ArrayList<Integer> userAge = new ArrayList<>();

    //add
    static void addRecord (ArrayList<String> userNames, ArrayList<Integer> userAges){
        System.out.println("\n- You selected to add an entry -");
        System.out.print("Enter name: ");
        String name = input.next();
        userNames.add(name);

        System.out.print("Enter age: ");
        int age = input.nextInt();
        userAges.add(age);
        read(userNames, userAges);
    }

    //delete
    static void deleteRecord (ArrayList<String> userNames, ArrayList<Integer> userAges){
        System.out.println("\n- You selected to delete an entry -");
        System.out.print("Enter name to delete: ");
        String deleteUser = input.next();

        if(userNames.contains(deleteUser)){
            for (int x=0; x<userNames.size(); x++) {
                if (deleteUser.equals(userNames.get(x))) {
                    System.out.println(userNames.get(x) + " is deleted.");
                    userNames.remove(x);
                    userAges.remove(x);
                }
            }
        } else{
            System.out.println(" There is no " + deleteUser + "in the lists.");
        }
        read(userNames,userAges);
    }

    //view
    static void displayRecord (ArrayList<String> userNames, ArrayList<Integer> userAges){
        System.out.println( "\n- Display all entries -");

        for (int x=0; x < userNames.size(); x++){
            System.out.println(userNames.get(x) + " is " + userAges.get(x) + " years old.");
        }
        read(userNames,userAges);
    }

    //update
    static void updateRecord (ArrayList<String> userNames, ArrayList<Integer> userAges){
        System.out.println("\n- Update an entry -");

        System.out.print("Enter name to update: ");
        String userUpdate = input.next();
        if (userNames.contains(userUpdate)){
            for (int x=0; x <userNames.size(); x++) {
                if (userUpdate.equals(userNames.get(x))){
                    System.out.print("Enter new name: ");
                    String name = input.next();
                    userNames.set(x,name);
                    System.out.print("Enter new age: ");
                    int age = input.nextInt();
                    userAges.set(x,age);
                    break;
                }
            }
        } else {
            System.out.println("There is no" + userUpdate + " in the list.");
        }
        read(userNames,userAges);
    }

    static void exitRecord (ArrayList<String> userNames, ArrayList<Integer> userAges){
        System.out.println("Exit");
        System.exit(0);

    }

    static void read(ArrayList<String> userNames, ArrayList <Integer> userAges){
        System.out.println("\n Julliane Pearl Camarista BSCS 2B \n"
                    + "1. Add Entry \n" + "2. Delete Entry \n" + "3. View All Entries \n"
                    + "4. Update An Entry \n" + "0. Exit" );
        System.out.print("\n Enter the number of your choice: ");
        int user_in = input.nextInt();
        switch (user_in){
            case 1:
                addRecord(userNames,userAges);
            case 2:
                deleteRecord(userNames, userAges);
            case 3:
                displayRecord (userNames,userAges);
            case 4:
                updateRecord(userNames, userAges);
            case 0:
                exitRecord (userNames, userAges);
            default:
            {
                System.out.println("Invalid Input. Choose the number on the choices only.");
                read(userNames, userAges);}
        }

    }
    public static void main(String[] args){
        read(userName,userAge);
    }
}
