
/**
 * Write a description of class StudentManager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
public class StudentManager 
{
    private List<Student> students;
    
    public StudentManager(){
        this.students=new ArrayList<>();  
    
    }
    public void loadStudentsFromFile(String fileName) throws IOException{
        BufferedReader reader=new BufferedReader(new FileReader(fileName));
        String line;
        
    
    }
    
}
