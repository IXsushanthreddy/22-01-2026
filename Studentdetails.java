
import java.util.Scanner;

class Student{
    //creating private variables
    private int id;
    private String name;
    private int score;
    //getter method for id
    public int getId(){
        return id;
    }
    //getter method for name
    public String getName(){
        return name;
    }
    //getter method for score
    public int getScore(){
        return score;
    }

    //setter method for all id,name,score
    public void setDetails(int id,String name,int score){
        this.id=id;
        this.name=name;
        this.score=score;
    }
    //displays the student details
    void displayDetails(int id,String name,int score){
        setDetails(id,name,score);
        System.out.println("Student ID: "+getId());
        System.out.println("Student Name: "+getName());
        System.out.println("Student Score: "+getScore());
    }
    //checks student is passed if passed returns true
    boolean isPassed(){
        if(score>=40){
            return true;
        }
        else{
            return false;
        }
    }

} 
public class Studentdetails{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a ID:");
        int studentId=sc.nextInt();
        System.out.println("Enter a name:");
        String studentName=sc.next();
        System.out.println("Enter a score:");
        int studentScore=sc.nextInt();
        Student s= new Student();
        s.displayDetails(studentId,studentName,studentScore);
        System.out.println("Student Passed?");

        System.out.println(s.isPassed());

sc.close();


    }
}























public class marks {
    
}
