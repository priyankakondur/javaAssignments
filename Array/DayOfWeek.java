package Array;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
       // Make array that holds texual value of days like “Monday, Tuesday etc

        String[] days= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        //take input from user
        System.out.println("Enter a day of the week(1-7)");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num >=1 && num <=7) {
            System.out.println(days[num-1]);
        }
        else
        {
            System.out.println("Please enter a number between 1 to 7");
        }



        }


    }

