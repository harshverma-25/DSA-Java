package Basics;
import java.util.Scanner;
public class TakingInput {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String s = sc.nextLine();

        System.out.println("Enter Your Age : ");
        int age = sc.nextInt();

        System.out.print("My name is "+ s + " and My Age is " + age);


    }
}
