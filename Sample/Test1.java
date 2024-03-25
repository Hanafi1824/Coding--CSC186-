package Sample;
import java.util.*;

public class Test1 {
    public static void main(String[] args){
        Scanner java = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int a = java.nextInt();
        System.out.println("Enter the second number: ");
        int b = java.nextInt();

        if (a % 2 == 0){
            System.out.println("The first number is even");
        }
        else{
            System.out.println("The first number is odd");
        }
    }
    
}