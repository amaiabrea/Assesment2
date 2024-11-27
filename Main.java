
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main
{
    public static void main (String[] args){
        
        Scanner scanner=new Scanner(System.in);
        
    try{
        System.out.print("Enter the file name: ");
        String fileName=scanner.nextLine();
    
    
        }catch(Exception e){
        System.out.println("Error reading the file");
        return;
        }
        
    while(true){
        System.out.println("\nMenu");
        System.out.println("1. Print all students and their marks");
        System.out.println("2. Filter students below a threshold");
        System.out.println("3. Print top 5 and bottom 5 students");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
        
        }
}
}

