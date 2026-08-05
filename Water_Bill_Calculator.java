import java.util.*;
public class Water_Bill_Calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Water in lit:-");
        int water=sc.nextInt();
        double bill=0;
        if(water<=1000){
            bill=water*2;
        }
        else if(water<=2000){
            bill=1000*2+((water-1000)*3);
        }
        else{
            bill=1000*2+1000*3+((water-2000)*5);
        }
       if(bill>6000){
        bill=bill+(bill*10/100);
       }
       System.out.println("your bill is :- "+ bill);
    }
    
}
