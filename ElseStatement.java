import java.util.Scanner;

public class ElseStatement {
     public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            if (a > 100)
                System.out.println("Big");
            else
                System.out.println("Number");
        }
    }
}
