//public class Methodpra {
//      static int max(int x , int y )
//      {
//          if(x>y){
//              return x;
//          }
//          else return y ;
//      }
//      public static void main(String[] args) {
//          int a = 10 , b = 15 ;
//          System.out.println(max(a, b));
//      }
//  }


// public class Methodpra { static
//  String update(String email ){
//          int a = email.indexOf("@");
//         String nam = email.substring(0 ,a);
//         return nam;

//     }
//     public static void main(String[] args) {
//         String email = "baaesemohdwaali@gmail.com";
//         System.out.println(update(email));
//     }
// }


// public class Methodpra {
//     int multi(int x , int y ){
//         int z = x * y;
//         return z;
//     }

//     public static void main(String[] args) {
//         Methodpra mT = new Methodpra();
//         int a = 10 , b = 15 ;
//         System.out.println(mT.multi(a, b));
//     }
// }

// public class Methodpra {

//     static void update(int A[]){
//         A[0]=25;
//     }

//     public static void main(String[] args)
//     {
//         int A[] = {2,4,6,1,22};
       
//         Methodpra.update(A);
//         // System.out.println(A[]);
//         System.out.println(A[0]) ;

//     }
// }
// public class Methodpra {

//     static void update(int  A[],int index , int value){
//         A[index]=value;
//     }

//     public static void main(String[] args){
//         int i = 0;
//         int A[] = {2,10,40,50,12};
//         Methodpra.update(A,3, 60);
//         for(int x:A){
//             System.out.print(x);
//             if( i<A.length-1){
//                 i++;
//                 System.out.print(",");
//             } else { // ider par else ka use iss liye hua hai kyu ki for loop chalta rehe ga even if condition false hogi . 
//                 i++;
//             }
//         }
//     }
// }

// Find if number is prime ?  
// public class Methodpra {

//     static boolean isPrime(int num){
//     for (int i = 2; i < num / 2; i++){
        
//         if(num % i == 0){
//             return false;
//         }
//     }
//     return true;
// }
// public static void main(String[] args) {
//     int num = 3;
//     System.out.println(isPrime(num));

// }
// }

// find gcd of number?

// import java.util.Scanner;

// public class Methodpra {
//       static int gcd(int x , int y){
//         while (x!=y) {
//             if (x>y) {
//                 x = x - y;
//             }
//             else {
//                 y=y-x;
//             }
            
//         }
//         return x;
//       }
//       public static void main(String[] args) {
//             //int m = 25 , n = 15;
//             Scanner sc = new Scanner(System.in);
//             int m = sc.nextInt();
//             int n = sc.nextInt();
//             Methodpra mp = new Methodpra();
//              int p = mp.gcd(m,n);
//              System.out.println(p);
//             // System.out.println(p);
//       }
// }

// find the greatest number in array ?

// public class Methodpra {
//        static int greater(int A[]){
//         int temp = A[0];
//         for(int i = 0; i<A.length-1;i++){
//             if (temp<A[i+1]) {
//                 temp = A[i+1];                
//             }
//         }
//         return temp;
//        }

//     public static void main(String[] args) {
//         int A[]={54,2,64,10,20};
//         System.out.println(greater(A));
//     }

    
// }