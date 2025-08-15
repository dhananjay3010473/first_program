import java.util.Scanner;
public class tempIncelcius {
    public static void main(String[] args){
     Scanner input= new Scanner(System.in);
     System.out.println("enter temprature in fahrenheit ");
     float f= input.nextInt();
     float c= (f-32)*5/9;
     System.out.println(" the temprature in celcius is :"+c);
    }
}