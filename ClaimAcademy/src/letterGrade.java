import java.util.*;

public class letterGrade {
public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter grade");
    int uinput = sc.nextInt();

    if(uinput >= 90 && uinput <= 100){

        System.out.println("A");
    }
    else if(uinput >= 80 && uinput <= 89){

        System.out.println("B");
    }
    else if(uinput >= 72 && uinput <= 79){

        System.out.println("C");
    }
    else if(uinput >= 64 && uinput <= 71){

        System.out.println("D");
    }
    else if(uinput >= 0 && uinput <= 71){

        System.out.println("F");
    }
    else{
        System.out.println("Invalid input");
    }

}

}
