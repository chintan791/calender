import java.util.Calendar;
import java.util.Scanner;


import java.util.Scanner;



public class calender {

 

    public static void main(String[] args) {

 

        String[] days = { "	Mon	", "Tue	", "Wed	", "Thur	", "Fri	", "Sat	", "Sun	"};

 

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number Of Days In The Month: ");

        int Calendar = scan.nextInt();

 
       

        for (int i = 0; i < days.length; i++) {

            System.out.print(days[i]);

        }

 

 

        {

       

       System.out.print("Enter First Day In The Month between 0 to 6 for Mon to Sun: ");

            int day1 = scan.nextInt();


            for (int i = 0; i < days.length; i++) {

                System.out.print(days[i]);

        }

    

             for(int x = 0; x < day1; x++) {

  
            	 System.out.println(" ");
             }

            

              

            for (int i = 1; i <= Calendar; i++) {


             

                  

 

                        System.out.print("	" + i);

                day1++;

                   

                     

                    if ((i+day1)%7==0){

                     

            System.out.println();}

         

    }

}

     

    }

}
