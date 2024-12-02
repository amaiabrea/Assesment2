
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Person
{
 private String lastName;
 private String firstName;
 private String studentId;
 
 
 
 public Person(String lastName, String firstName, String studentId){
    this.lastName=lastName;
    this.firstName=firstName;
    this.studentId=studentId;    
    
    }
    
public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
public String getStudentId(){
        
        return studentId;
    }
    
public abstract String toString();
    
    }
    
    

