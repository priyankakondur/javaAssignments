package Array;

import java.util.Random;
import java.util.Scanner;

public class RandomCarDigit {
    public static void main(String[] args) {
        //Take input from user for number of unique car number to generate
        System.out.println("Enter Number of car numbers to generate");
        Scanner sc = new Scanner(System.in);
        int carNo = sc.nextInt();

        Random r = new Random();
        int[] arr= new int[100];


        for (int i = 1; i<= carNo; i++) {
            arr[i] = r.nextInt((9999-1000)+1000);// Random Number generation for Car
            int Temp = arr[i];

            // Checks each previously generated car number for duplication and generates a new random number if found
            {
                for (int j = 1; j<i; j++) {
                    if (arr[j] == Temp) {
                        System.out.println("Duplicate caught");
                        arr[i] = r.nextInt((9999-1000)+1000);
                    }
                }
            }
            // Prints all the car number as per user request
            {
                System.out.println("MH"+arr[i]);   //Print format of car number to be MH{Random4digits}: MH3459
            }

        }

    }
}
