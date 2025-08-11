// public class methodo {

//     static int area(int l , int b){
//         int Area = l*b;
//         return Area;
//     }

//     static double area(double r ){
//         double Area = Math.PI*r*r;
//         return Area;
//     }

//     static double area(double b, double h){
//         double Area = b*h/2;
//         return Area;
//     }

//     public static void main(String[] args) {
//         System.out.println("Area of rectangle is " + area(10, 5));
//         System.out.println("Area of circle is " + String.format("%.2f", area(4)));
//         System.out.println("Area of triangle is " + area(6.3, 7.2));
//     }

// }

// reverse the int or array 

// public class methodo {

//     static int reverse(int n){
//         int rev = 0;
//         while (n!=0) {
//             rev = rev * 10  + n % 10;
//             n = n/10;
        
//         }
//         return  rev;


      
        
//     }
//     static int[] reverse(int A[]){
//         int[] B= new int[A.length];
//         for (int i = A.length-1 , j = 0; i >=0 ;i--,j++){
//              B[j]=A[i];
//         }
//         return B ;
        

//     }
//     public static void main(String[] args) {
//         int n = 432 ;
//        int m= reverse(n);
//        System.out.println(m);
//        int[] A={2,4,6,8};
//         int[] reversedArray = reverse(A);
//         for (int val : reversedArray) {
//             System.out.print(val + " ");
//         }
       

        
//     }


// }

// recursion 

// public class methodo {

//     static void fun(int n){
//         if(n>0){
//         System.out.println(n);
//         fun(n-1);
//     }
// }
//     public static void main(String[] args) {
//         int n = 3 ;
//         fun(n);
//     }
// }