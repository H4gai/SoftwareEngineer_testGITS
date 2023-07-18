
//import 
import java.util.*;
import java.lang.*;
import java.io.*;

//class test1
public class test1 {

    // funcion A00124 Formula
    static void no1(int n) {

        System.out.println();

        System.out.print("Output ");

        // The number of terms to generate
        for (int i = 0; i < n; i++) {
            // for delete "-" in last number
            if (i == n - 1) {
                // print with formula (i(i+1)/2)+1
                System.out.print(((i * (i + 1)) / 2) + 1);
            } else {
                System.out.print(((i * (i + 1)) / 2) + 1 + "-");
            }
        }
    }

    // function main
    public static void main(String[] args) {

        // create input
        Scanner input = new Scanner(System.in);
        // inisialization
        int n, m, o;
        // input how much number
        System.out.print("Input ");
        n = input.nextInt();
        // call the function
        no1(n);

    }
}