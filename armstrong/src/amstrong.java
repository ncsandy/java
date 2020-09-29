import java.util.Scanner;

public class amstrong {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        System.out.println("Armstrong Number Checker: ");


        int n = sc.nextInt();
        int product = 0;
        int total = 0;
        int temp = n;



        while(n > 0){

           int r = n % 10;
           n = n / 10;


           product = r * r * r;

           total += product;


        }


        if(temp == total){
            System.out.println("Number is an armstrong number!");

        }else{
            System.out.println("Number is NOT an armstrong number..");
        }


        }


    }

