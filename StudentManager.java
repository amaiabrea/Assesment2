
/**
 * Write a description of class StudentManager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
public class StudentManager implements Sortable
{
    private List<Student> students;
    
    public StudentManager(){
        this.students=new ArrayList<>();  
    
    }
    public void loadStudentsFromFile(String fileName) throws IOException{
        BufferedReader reader=new BufferedReader(new FileReader(fileName));
        String line;
        
        while((line=reader.readLine())!=null){
            if (line.startsWith("#")) continue;
            String[] parts = line.split(",");
            if (parts.length == 5) {
                String name = parts[0].trim();
                String id = parts[1].trim();
                int mark1 = Integer.parseInt(parts[2].trim());
                int mark2 = Integer.parseInt(parts[3].trim());
                int mark3 = Integer.parseInt(parts[4].trim());
                students.add(new Student(name, id, mark1, mark2, mark3));
        
        }
    
    }
    reader.close();
    public void printAllStudents(){
    
        for(Student student : students){
        System.out.println(student);
        }
    
    }
    
}


