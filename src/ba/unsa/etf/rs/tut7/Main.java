package ba.unsa.etf.rs.tut7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = new int [5];

        Scanner ulaz = new Scanner(System.in);

        for (int i = 0; i < array.length; i++)
            array[i] = ulaz.nextInt();

        Arrays.sort(array);

        for (var x: array)
            System.out.print(x + " ") ;

    }
}
