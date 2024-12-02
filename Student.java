
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends Person
{
   private double mark1, mark2, mark3, totalMarks;
   
   
   public Student(String firstName, String lastName, String studentId, double mark1, double mark2, double mark3){
    
   super(lastName, firstName, studentId); 
   this.mark1=mark1;
   this.mark2=mark2;
   this.mark3=mark3;
    this.totalMarks=mark1+mark2+mark3;
    
    }
    
    public double getTotalMarks(){
        return totalMarks;
    }
    
    @Override
    public String toString(){
    return getLastName()+ ", " + getFirstName() + " (ID: " + getStudentId() + ") - A1: " + mark1 + ", A2: " + mark2 + ", A3: " + mark3 + " | Total: " + totalMarks;
    
    }
        
    }

