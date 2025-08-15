import java.util.Scanner;
public class Calculator {
    public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the operation");
    char ch=sc.next().charAt(0);
    System.out.println("enter the two numbers");
int num1=sc.nextInt();
int num2=sc.nextInt();
int ans=0;
    if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
     if(ch=='+'){
        ans=num1+num2;
     }  
     if(ch=='-') {
        ans=num1-num2;
     }
     if(ch=='*'){
        ans=num1*num2;
     }
     if(ch=='/'){
        ans=num1/num2;
     }
    }
    else{
        System.out.println("invalid operation");
    }
    System.out.println("ans is :"+ans);
}
}