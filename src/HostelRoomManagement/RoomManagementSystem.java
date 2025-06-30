package HostelRoomManagement;

import java.util.Objects;
import java.util.Scanner;

public class RoomManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RoomInventory roomInventory = new RoomInventory();
        Student student1 = new Student("Irza Hasan", "SE",3);
        Student student2 = new Student("Insha Farooqui", "CS",1);
        Student student3 = new Student("Haniya Khawaja", "SE",8);
        Student student4 = new Student("Zareen Khan", "SE",2);

        boolean run = true;
        while (run){
            System.out.println("Welcome");
            System.out.println("Press below option for desire operation");
            System.out.println("1) Enroll Student");
            System.out.println("2) Add Room");
            System.out.println("3) Allocate Student");
            System.out.println("4) Vacate Student");
            System.out.println("5) Show Room list");
            int option = scanner.nextInt();

            switch (option){
                case 1:
                    scanner.nextLine();
                    System.out.print("Enter name: ");
                    String studentName = scanner.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = scanner.nextLine();

                    System.out.print("Enter Semester: ");
                    int semester = scanner.nextInt();

                    Student newStudent = new Student(studentName, dept, semester);
                    break;
                case 2:
                    System.out.print("Enter Room no.: ");
                    int roomNo = scanner.nextInt();

                    System.out.print("Enter Capacity ");
                    int roomCapacity = scanner.nextInt();

                    roomInventory.addRoom(roomNo,roomCapacity);
                    break;
                case 3:
                    roomInventory.allocateStudent(student1);
                    break;
                case 4:
                    roomInventory.vacateStudent(student1);
                    break;
                case 5:
                    roomInventory.showRoomInfo();
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            System.out.println();
            System.out.println("Do you want to perform more action??" +
                    "\npress \"y\" for yes and \"n\" for no");
            String input = scanner.next();
            if (!Objects.equals(input, "y")){
                run=false;
            }
            System.out.println(run);


        }
        roomInventory.showRoomInfo();
    }
}
