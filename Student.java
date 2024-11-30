
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends Person
{
   private int mark1, mark2, mark3, totalMarks;
   
   
   public Student(String name, String id, int mark1, int mark2, int mark3){
    
   super(name, id); 
   this.mark1=mark1;
   this.mark2=mark2;
   this.mark3=mark3;
    this.totalMarks=mark1+mark2+mark3;
    
    }
    
    public int getTotalMarks(){
        return totalMarks;
    }
    
    @Override
    public String toString(){
    return getName()+ "(" +getId()+"):"+mark1+","+mark2+","+mark3+".Total:"+totalMarks;
    
    
    }
        
    }

