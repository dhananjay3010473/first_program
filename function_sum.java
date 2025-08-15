import java.util.Scanner;

public class function_sum {
 public static void main (String [] args) {
sum();

 } 
      static void sum(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n0 1");
        int a=sc.nextInt();
        System.out.println("enter the no 2");
        int b =sc.nextInt();
       int sum = a+b;
        System.out.println(sum);
  }
}
