
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
public class Main
{
    public static void main (String[] args){
        StudentManager manager=new StudentManager();
        Scanner scanner=new Scanner(System.in);
        
        try{
            System.out.print("Enter the file name: ");
            String fileName=scanner.nextLine();
            manager.loadStudentsFromFile(fileName);
            System.out.println("File loaded succesfully");
    
        }catch(Exception e){
            System.out.println("Error reading the file"+ e.getMessage());
            return;
            
        }
        while(true){
            System.out.println("\nMenu");
            System.out.println("1. Print all students and their marks");
            System.out.println("2. Filter students below a threshold");
            System.out.println("3. Print top 5 and bottom 5 students");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice;
            try{
               choice=scanner.nextInt();
            
            }catch(Exception e){
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                scanner.nextLine();
                continue;
            }
            
            switch(choice){
                case 1:
                    System.out.println("\nAll Students:");
                    manager.printAllStudents();
                    break;
                case 2:
                    System.out.println("Enter the threshold:");
                    int threshold;
                    try{
                        threshold=scanner.nextInt();
                    
                    }catch(Exception e){
                    System.out.println("Invalid input.please enter a vaalid number.");
                    scanner.nextLine();
                    continue;
                    }
                    System.out.println("\nStudents with total marks below " + threshold + ":");
                    for (Student student : manager.filterStudentsBelowThreshold(threshold)) {
                        System.out.println(student);
                        }
                        break;
                case 3:
                System.out.println("\nTop and bottom 5 students:");
                manager.printTopBottomSudents();
                break;
                
                case 4:
                System.out.println("Exiting the programm.Goodbye!:)");
                    return;
                    
                default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                
                 
        
            }
        }
        }
        }
    


