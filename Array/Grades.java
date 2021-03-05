package Array;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        //take number of grades from user
        System.out.println("Enter number of grades");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //declare array to store n values
        int[] grades = new int[n];
        int avg =0, sum=0, i, j, swp;
        System.out.println("Enter grades");
        //store grades inside array
        for(i=0;i<n;i++){
            grades[i]= sc.nextInt();
            //add all the grades
            sum = sum+grades[i];
        }
        // store grades in ascending order to find highest and lowest grades
for(i=0;i<n;i++){
    for(j=i;j<n;j++){
        if(grades[i]>grades[j])
        {
            swp = grades[i];
            grades[i]=grades[j];
            grades[j]=swp;
        }

    }
}
avg = sum/n;
        System.out.println("Average: "+avg);
        System.out.println("Highest: "+grades[n-1]);
        System.out.println("Lowest: "+grades[0]);
    }
}
