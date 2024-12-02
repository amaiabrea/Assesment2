
/**
 * Write a description of class StudentManager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
public class StudentManager implements Sortable{
    private List<Student> students;
    
    public StudentManager(){
        this.students=new ArrayList<>();  
    
    }
    public void loadStudentsFromFile(String fileName) throws IOException{
        try(BufferedReader reader=new BufferedReader(new FileReader(fileName))){;
            String line;
        
        while((line=reader.readLine())!=null){
            if (line.startsWith("#") || line.trim().isEmpty()) continue;
            
            String[] parts = line.split(",");
            if (parts.length == 5) {
               try{
                String name = parts[0].trim();
                String id = parts[1].trim();
                int mark1 = Integer.parseInt(parts[2].trim());
                int mark2 = Integer.parseInt(parts[3].trim());
                int mark3 = Integer.parseInt(parts[4].trim());
                
                students.add(new Student(name, id, mark1, mark2, mark3));
            }catch(NumberFormatException e){
            System.out.println("Invalid marks format in line: " + line);
            }
        }else {
            System.out.println("Invalid line format: " + line);
        }
    
    }
}
    
}
    public void printAllStudents(){
    
        for(Student student : students){
        System.out.println(student);
        }
    
    }
    public List<Student> filterStudentsBelowThreshold(int threshold) {
        List<Student> filtered = new ArrayList<>();
        for (Student student : students) {
            if (student.getTotalMarks() < threshold) {
                filtered.add(student);
            }
        }
        return filtered;
}

@Override
public void sortDescending(List<Student> students){
    int n=students.size();
    for(int i=0; i<n-1;i++){
        for (int j=0; j<n-i; j++){
            if(students.get(j).getTotalMarks() < students.get(j +1).getTotalMarks()){
                Student temp = students.get(j);
                students.set(j, students.get(j + 1));
                students.set(j + 1, temp);
            
            }
        }
        }    


}

public void printTopBottomSudents(){
    sortDescending(students);
    
    System.out.println("\nTop 5 Students:");
    for(int i = 0; i < Math.min(5, students.size()); i++) {
            System.out.println(students.get(i));
        }
    
    System.out.println("\nBottom 5 Students:");
    for(int i=Math.max(0,students.size() -5); i< students.size();i++){
        System.out.println(students.get(i));
    }
}
public List<Student> getAllStudents(){
return students;
}
}

