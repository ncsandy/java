import java.util.*;

public class ReportPro {




    public static void main(String [] args) {

        double[] list = new double [7];
        double max = list[0];
        double min = Double.MAX_VALUE;
        double avg = 0.0;
        double sum = 0.0;
        boolean isRunning = true;
        int entry = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Report Builder");
        System.out.println("===================================================");
        System.out.println("Please enter your first name: ");
        String first_name = sc.nextLine(); //input from user of the first name
        String filterF = first_name.replaceAll("[^a-zA-Z]+", ""); //filters the name
        System.out.println("Please enter your last name: ");
        String last_name = sc.nextLine(); //input from user of the last name
        String filterL = last_name.replaceAll("[^a-zA-Z]+", ""); //filters the name

        System.out.print("Hello " + filterF+ " ");
        //Printing Last name on character at time
        for(int i = 0; i < filterL.length(); i++){
                System.out.print(filterL.charAt(i));

            }
        System.out.println("");
        System.out.println("");
        System.out.println("Please enter your report name");
        String report_name = sc.nextLine(); //user input for report name



        for(int i = 0; i< list.length; i++){

            double temp;
            System.out.println("Enter a value ");
            temp = sc.nextDouble(); //getting user input for populate array
            list[i] = temp; //assigning user input to appropriate index in the array
            entry++;
            System.out.println(""); //spacing for neatness.
            sum += list[i];        //adds  current element in array to sum
            avg = (sum) / (i+1);   //averages total as the loop iterates

            if(list[i] < min){    //checking for min
                min = list[i];
            }
            if(list[i] > max){   //checking for max
                max = list[i];
            }

            System.out.println("Numeric entries " + entry);
            System.out.println("The min value is " + min);
            System.out.println("The max value is " + max);
            System.out.println("The average is " + avg);
            System.out.println("The sum is "+ sum);
            System.out.println("");


        }

        while(isRunning == true){

            System.out.println("Enter an option");
            System.out.println("1. Print report");
            System.out.println("-1. Quit");
            int uinput = sc.nextInt();
            switch(uinput){
                case 1:
                    System.out.println("Owner: " + first_name + " "+ last_name);
                    System.out.println("=====================================");
                    System.out.println("Report name " + report_name);
                    System.out.println("=====================================");
                    System.out.println("You've entered the following entries");
                    for(double x: list){
                        System.out.print(x+" ");
                    }
                    System.out.println("");
                    System.out.println("=====================================");
                    System.out.println("The highest number you entered was " + max);
                    System.out.println("=====================================");
                    System.out.println("The lowest number you entered was " + min);
                    System.out.println("=====================================");
                    System.out.println("The sum of the numbers were " + sum);
                    System.out.println("=====================================");
                    System.out.println("The average of the numbers were  " + avg);
                    System.out.println("=====================================");
                    System.out.println("The total amount of enteries were " + entry);
                    System.out.println("=====================================");
                    break;
                case -1:
                    System.out.println("Cyuh!");
                    isRunning = false;
                    break;

                default: System.out.println("Invalid input");
                    break;
            }




        }



    }



}
