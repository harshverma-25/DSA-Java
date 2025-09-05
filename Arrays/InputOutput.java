import java.util.*;
public class InputOutput {
    public static void main(String[] args) {
        int marks[] = new int[5];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

         System.out.print("The marks is ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        

    }
}
