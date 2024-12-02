
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
        boolean isFirstLine=true;
        
        while((line=reader.readLine())!=null){
            if (isFirstLine || line.trim().isEmpty()) {
                isFirstLine = false;
                continue;
            }
            String[] parts = line.split(",");
            
            
            if (parts.length == 6) {
               try{
                String lastName = parts[0].trim();
                String firstName=parts[1].trim();
                String studentId = parts[2].trim();
                
                double mark1 = parts[3].trim().isEmpty() ? 0.0 : Double.parseDouble(parts[3].trim());
                double mark2 = parts[4].trim().isEmpty() ? 0.0 : Double.parseDouble(parts[4].trim());
                double mark3 = parts[5].trim().isEmpty() ? 0.0 : Double.parseDouble(parts[5].trim());
                
                students.add(new Student(lastName, firstName, studentId, mark1, mark2, mark3));
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

