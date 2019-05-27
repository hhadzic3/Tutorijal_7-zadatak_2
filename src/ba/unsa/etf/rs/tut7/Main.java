package ba.unsa.etf.rs.tut7;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println("Unesite niz brojeva: ");
        ArrayList<Integer> niz = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int tok;
        tok = scanner.nextInt();
        while (tok != 0) {
            niz.add(tok);
            tok = scanner.nextInt();
        }

        //obicna implementacija:
        // Comparator comparator = new Comparator<Integer>() {
        //            @Override
        //            public int compare(Integer o1, Integer o2) {
        //                int sumFirst = 0;
        //                while (o1 != 0) {
        //                    sumFirst += o1 % 10;
        //                    o1 /= 10;
        //                }
        //                int sumSecond = 0;
        //                while (o2 != 0) {
        //                    sumSecond += o2 % 10;
        //                    o2 /= 10;
        //                }
        //                return sumFirst - sumSecond;
        //            }
        //        };
        //Collections.sort(niz, comparator);

        
        Collections.sort(niz, new Comparator<Integer>() {
            public int compare(Integer br1, Integer br2) {
                int sumaCfifara1 = 0;
                while (br1 != 0) {
                    sumaCfifara1 += br1 % 10;
                    br1 /= 10;
                }

                int sumaCifara2 = 0;
                while (br2 != 0) {
                    sumaCifara2 += br2 % 10;
                    br2 /= 10;
                }
                return (sumaCfifara1 - sumaCifara2);
            }
        });

        System.out.println("Sortirani niz glasi: ");

        for (int i : niz)
            System.out.print(i + " ");

    }
}
