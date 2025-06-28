import java.util.*;

public class NdaysBack {
    
    public static void main(String[] args) {
        try (// 0 1 2 3 4 5 6 7 8 9
       Scanner inp = new Scanner(System.in)) {
        // creating a veriable d & n .
           System.out.println("Enter a number of day present : ");   
           byte d = inp.nextByte();
           System.out.println("Enter a number of days back :");
           int n = inp.nextInt();
             int x = n%7;
            int ans = d-x;
            if (ans<0) {
                System.out.println("Your Result of Day is :"+(ans+7));
            }
            else{
                System.out.println("Your Result of Day is :"+(ans));
            }
       }

    }
}
