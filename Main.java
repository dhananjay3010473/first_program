import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number ");
        int n=in.nextInt();
        System.out.println("enter the number whose repitition is to be checked");
        int b=in.nextInt();
        int count =0;
        while(n>0){
            int x=n%10;
            n = n/10;
            if(x==b){
                count++;
            }
        }
        System.out.println(count);
}
}