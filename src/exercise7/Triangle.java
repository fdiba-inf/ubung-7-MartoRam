package exercise7;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = input.nextInt();


            printLine(1, n);


        // Print the bottom part of the triangle that is under the longest line
    }

    public static void printLine(int start, int end) {
        // Implement method

            String bull="";
            for (int j=start;j<=end;j++)
            {
                bull=bull+j+" ";
                System.out.println(bull.substring(0,bull.length()-1));
            }
            for (int k=start;k<end;k++)
            {
                int i=2;
                bull=bull.substring(0, bull.length()-i);
                System.out.println(bull.substring(0, bull.length()-1));
                i++;
            }



    }
}
