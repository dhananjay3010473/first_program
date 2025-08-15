import java.util.Scanner;
public class lafgestOfThree {
 public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.println("enter the first number");
    int a=in.nextInt();
    System.out.println("enter the second number");
    int b = in.nextInt();
    System.out.println("enter the third number");
    int c = in.nextInt();
    /* 
    int max = a;
    if (b>max){
        max=b;
    }
    if(c>max){
        max=c;
    }*/
    //second method of this(with the help of libraryfunctions)
    int max = Math.max(c,Math.max(a,b));54

    System.out.println("largest number is :"+max);
    
 }  
}
//third method is in c programing
