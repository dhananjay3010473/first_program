import java.util.Scanner;
public class  ReverseOfnumber{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number ");
        int n=in.nextInt();
        int ans=0;
        while(n>0){
         int x=n%10;
            ans = ans*10+x;

            n = n/10;
            }
            System.out.println(ans);
        }
      
}
