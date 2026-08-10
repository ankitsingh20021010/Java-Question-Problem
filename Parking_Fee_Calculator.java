import java.util.*;
public class Parking_Fee_Calculator{
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double charge=0;
        System.out.print("Enter hours: ");
       int hours=sc.nextInt();
       if(hours<=2){
           charge=hours*20;
       }
       else if(hours <=5){
           charge=2*20+((hours-2)*30);
       }
       else if(hours<=10){
           charge=2*20+3*30+((hours-5)*40);
       }
       else{
           charge=2*20+3*30+5*40+((hours-10)*50);
       }
       if(charge>500){
           charge=charge+(charge*10/100);
       }
       System.out.println("Parking Charge is:"+ charge);
    }
}
