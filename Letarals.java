public class Letarals {
    public static void main(String[] args) {

        // bitwise operation
        // int x = 10 , y=6 , z;
        // z = x ^ y ;
        // float d = x >>> 2 ;
        // System.out.println(z);
        // System.out.println(x);
        // System.out.println(d);

        // Marging bits
        // a=a|b;
        // System.out.println(a);
        // int a=0 , b=8;
        // b=64;
        // a=a|b;
        // System.out.println(a);

        // int a=72, b = 8 ; // it tell's masking.
        // a=a&b;
        // System.out.println(a);

        // Type casting ( Narrowing )
        // float y = 12.23f ;
        // System.out.println(y);
        // int x = (int)y; // here we are forcing the float variable to convert into
        // integer value
        // System.out.println(x); /* here we can clearly see that the float data is
        // lossy */

        // printing
        // int a = -10 ;
        // System.out.printf( "%(5d" , a ); // five boxes are created and each charecter is placed in each box from last and bracket is use for removing the sing.
        //    float x= 2.128f;
        //    System.out.printf("%1.2f",x); // here befor point the value specify the boxes and after point the value specify the how mant number is allowed after point 
        //  int t = 20 ;
        //  System.out.printf("%-5d",t);// negative sign place the value from first box .

        // formate Specifier
        // int x = 10;
        // float y = 12.3f;
        // char z = 'A';
        // String str = "world";
        // System.out.printf("Hello %d %f %c %s \n ",x ,y, z, str);
        // System.out.printf("Hello %3$d %2$f %1$c %s \n",z ,y,x , str); //  here $ sign help krta hai ki hm kis position pe kisi bhi veriables ko put kr skte hai .
        // System.out.printf("Hello %c \n ", z  );

        // String
        // char c[] = {'a','b', 'c'};
        // String str = new String(c); // Here we  can convert the array into string 
        // System.out.println(str);
        // byte b[] = {65 , 66 ,67 , 68};
        // String str2 = new String(b);
        // System.out.println(str2); 
    
      
        // Scanner sc = new Scanner (System.in);
        // System.out.println("Enter a");
        //  int a = sc.nextInt();
        //  float b = sc.nextFloat();
        //  long c = sc.nextLong();
        //  byte d = sc.nextByte();
        //  sc.nextLine();
        //  String s = sc.nextLine();
        //  System.out.printf("%d\n%.3f\n%d\n%d\n%s\n",a,b,c,d,s);

       int number = 5;

        if ((number & 1) != 0){
         
          System.out.println("Odd");
        }
        else {

            System.out.println("Even");
    }
    }
}
    


    


