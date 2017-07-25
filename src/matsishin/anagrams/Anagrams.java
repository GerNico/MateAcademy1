package matsishin.anagrams;

import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        anagrams();
    }

    private static void anagrams() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext("[\\p{L}]*")) {
            String word = sc.next("[\\p{L}]*");
            for(int i=word.length()-1;i>=0;i--)
                System.out.print(word.charAt(i));
            if(sc.hasNext("[\\p{L}]*"))System.out.print(" ");
        }
        System.out.println();
    }
}
