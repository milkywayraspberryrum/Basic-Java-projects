package assignment.pkg5;
import java.util.Scanner;
import java.lang.Math;


/**
 *
 * @author eschi
 */
public class Assignment5 {

    
    public static void main(String[] args) {
        Scanner hweight = new Scanner(System.in);
        System.out.print("What is the weight of the homework?");
        double hwWeight = hweight.nextDouble();
        
        Scanner ex1weight = new Scanner(System.in);
        System.out.print("What is the weight of the exam 1?");
        double exam1weight = ex1weight.nextDouble();
        
        Scanner ex2weight = new Scanner(System.in);
        System.out.print("What is the weight of the exam 2?");
        double exam2weight = ex2weight.nextDouble();
        
        Scanner hw = new Scanner(System.in);
        System.out.print("How many assignments has the student completed? ");
        double assignments = hw.nextDouble();
        
        Scanner lab = new Scanner(System.in);
        System.out.print("How many labs have they completed? ");
        double labs = lab.nextDouble();
        
        Scanner tardy = new Scanner(System.in);
        System.out.print("How many days have they been late? ");
        double late = tardy.nextDouble();
        
        Scanner E1 =  new Scanner(System.in);
        System.out.print("What is the score for exam 1? ");
        double Ex1 = E1.nextDouble();
        
        Scanner E2 =  new Scanner(System.in);
        System.out.print("What is the score for exam 2? ");
        double Ex2 = E2.nextDouble();
        
        Homeworkgrades(assignments, labs, late);
        
    }
   
    public static void Homeworkgrades(double assignments, double labs, double late){
       double newGrade = 0;
       double newScore = 0;
        if (late > (.5 * labs)){
           assignments *= 10;
           late *= 4;
           labs *= 4;
           newGrade = (assignments + labs) - late;
           newScore = newGrade/140.0;
      
           
       }
        else{
            assignments *=10;
            newGrade = assignments;
            newScore = newGrade/140.0;
        }
        
    }
    
    public static void finalhoweworkweight( double newScore, double hwWeight){
        double newHwWeight = newScore * (hwWeight/100);
    }
    
    public static void Exam1(double E1, double exam1weight){
        double FinalExamweight = E1 * (exam1weight/100);
        
    }
}
