import java.util.*;

public class Functions {

    static double Savings(int pv, double rate, int time) {

        double fv;
        rate = (rate) / 100;
        fv = pv * (1 + (rate * time));

        return fv;

    }

    static double computeTip(double bill, String service) {
        double tip = 0.0;

        switch (service) {

            case "Poor":
                tip = bill * 0.16;
                break;
            case "Good":
                tip = bill * 0.22;
                break;
            case "Great":
                tip = bill * 0.26;
                break;
            default:
                System.out.println("Invalid input");
                break;

        }
            return tip;
    }

    private static void returnChange(double customer, double product ){

        double change = customer - product;

        int qcoins;
        int dcoins;
        int ncoins;
        int pcoins;


        int quarter = 25;
        int  dime = 10;
        int  nickel = 5;
        int penny = 1;


        change = change * 100;

        int intChange = (int) change;

        System.out.println("Change is : " + intChange + " cents");
        qcoins = intChange / quarter;
        intChange = intChange % quarter;
        dcoins = intChange / dime;
        intChange = intChange % dime;
        ncoins = intChange / nickel;
        intChange = intChange % nickel;
        pcoins = intChange / penny;

        System.out.println("Quarters: " + qcoins );
        System.out.println("Dime: " + dcoins );
        System.out.println("Nickel: " + ncoins );
        System.out.println("Penny: " + pcoins );



   }

        public static void main (String[]args){


returnChange(18,17.18);
System.out.println(Savings(20000, 4.5, 15));
System.out.println(computeTip(33.57,"Great"));


    }

    }

