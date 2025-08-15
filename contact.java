import java.util.Scanner;
public class contact {
 public static void main(String [] args){
 Scanner sc=new Scanner(System.in) ;
 System.out.println("enter the department");
 String emer =sc.next();
 switch(emer){
    case "police" :
    System.out.println("100");
    break;
    case "fire" :
    System.out.println("101");
    break;
    case "ambulance" :
    System.out.println("108");
    break;
    case "emergency" :
    System.out.println("112");
    break;
    case "help line" :
    System.out.println("18001800550");
    break; 
    case "cleaning" :
    System.out.println("18003302550");
    break;
    default :
    System.out.println("please enter valid thing");
 }
 }   
}
