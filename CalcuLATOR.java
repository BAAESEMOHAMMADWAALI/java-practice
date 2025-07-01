public class CalcuLATOR {
     public void calculate(int a, int b, int operator) {
        switch (operator) 
        {
            case 1 : int add = a + b ; System.out.println(add);
                     break;
            case 2 : int sub = a - b ; System.out.println(sub);
                     break;
            case 3 : int mul = a * b ; System.out.println(mul);
                      break ; 
            default : System.out.println("Invalid Input");
        }
        
    }
}
