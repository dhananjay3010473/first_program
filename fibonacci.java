import java.util.Scanner;
public class fibonacci{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int n = in.nextInt();
        int a=0;
        int b=1;
        if(n>1){
        for(int i=2;i<=n;i++){
          int tem=b;
          b=a+b;
           a=tem;
        } 
       
        System.out.println("the fibonacci is "+b);
        }
        if (n==1){
          System.out.println(0);
        }
      }
      }
       
    
