import java.util.Scanner;

public class sallery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Basic salary:- ");
        int basic_salary=sc.nextInt();
        int gross=0;
        if(basic_salary<=20000){
           int hra=(basic_salary*10/100);
           int da=(basic_salary*20/100);
           gross=basic_salary+hra+da;
        }
        else if(basic_salary>20000 && basic_salary<=50000){
            int da=basic_salary*30/100;
            int hra=basic_salary*15/100;
            gross=basic_salary+da+hra;
        }
        else{
            int hra=basic_salary*20/100;
            int da=basic_salary*40/100;
            gross=basic_salary+da+hra;
        }
        if(gross>80000){
            gross=gross-(gross*5/100);
        }
        System.out.println("Gross Salary:"+gross);
    }
}
