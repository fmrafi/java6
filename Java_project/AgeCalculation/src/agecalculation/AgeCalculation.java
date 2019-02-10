package agecalculation;

import inputvalue.InputValue;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class AgeCalculation {

    int month[]={31,28,31,30,31,30,31,31,30,31,30,31};
    String id;
    int d,m,y;
    public AgeCalculation(){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter your day=");
    d=input.nextInt();
    System.out.println("Enter your Month=");
    m=input.nextInt();
    System.out.println("Enter your year=");
    y=input.nextInt();
    }
    public void calculateAge(){
    int date=0,mon=0,year=0;
    if(1<d&&1<m){
    date=((month[m-1]+01)-d);
    mon=12-m;
    year=2016-y;
     }
    else if(1<d&&1>=m){
    date=((month[m-1]+01)-d);
    mon=12-m;
    year=2016-y;
     }
     else if(d==1&&m==1){
    date=1-d;
    mon=13-m;
    year=2016-y;
     }
    System.out.println(year+" years" + mon +"Months " + date + "days");
    }
    
    public static void main(String[] args) {
        
        AgeCalculation obj=new AgeCalculation();
        obj.calculateAge();
        InputValue o=new  InputValue();
//        String  dateOfBirth="";
//        int y = 1990,m = 8,d = 29;
//        Calendar cal=new GregorianCalendar(y, m, d);
//        Calendar now=new GregorianCalendar();
//        int res=now.get(Calendar.YEAR)-cal.get(Calendar.YEAR);
//        
//        
//        if (cal.get(Calendar.MONTH)>now.get(Calendar.MONTH)|| 
//                  (cal.get(Calendar.MONTH)==now.get(Calendar.MONTH)) &&
//                  (cal.get(Calendar.DAY_OF_MONTH)>now.get(Calendar.DAY_OF_MONTH)))
//        {
//            res--;
//                       
//        }
//    System.out.println(res);
     

        
    }
    
}
