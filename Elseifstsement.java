import java.util.Scanner;

public class Elseifstsement {
    public static void main(String[] args) {
         try (Scanner sc =  new Scanner(System.in)){
        int n=sc.nextInt();
        if(n > 100 )System.out.println("Big");
        else if ( n < 10 ) System.out.println("Small");
        else System.out.println("Number");
    }
}
}
