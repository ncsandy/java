import java.math.*;

public class classRatio {

    public static void main (String [] args){

    double boys =11;
    double girls = 16;
    double students = girls + boys;
    double percentage;
    double ratio;
    double teachers = 2;

    percentage = ((girls) / (students) * 100);
    String percentage_ = String.format("%.3f", percentage);

    ratio = students / teachers;


    System.out.println(percentage_+"% of the class are girls");
    System.out.println("Student-Teacher ratio " + ratio);





    }


}
