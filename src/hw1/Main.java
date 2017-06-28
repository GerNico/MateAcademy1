package hw1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //findDistance();//When you testing it in Idea, you should: 1)enter your numbers, 2)pres enter 3)pres Ctrl+D
        anagrams();
    }

    @SuppressWarnings("unused")
    private static void findDistance() {
                /*
        Find Distance Твоя задача создать консольное приложение, которое принимало бы на вход ряд чисел и выводило
        расстояние между двумя наименьшими. Например, дано ряд чисел: "23 45 34 12 45 4 38 56 2 49 100".
        Наименьшие числа в нем 2 и 4. Расстояние между ними - 3.
        */
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> longmas = new ArrayList<>();
        while (sc.hasNextLong()) longmas.add(sc.nextLong());
        if (longmas.size() >= 2) {
            int min, almost;
            if (longmas.get(0) > longmas.get(1)) {
                min = 1;
                almost = 0;
            } else {
                almost = 1;
                min = 0;
            }
            for (int i = 0; i < longmas.size(); i++) {
                if (longmas.get(i) < longmas.get(min)) {
                    almost = min;
                    min = i;
                }
            }
            System.out.println("the answer is: " + (min - almost));
        } else System.out.println("too small");

    }

    private static void anagrams() {
    /*
    Anagrams На вход консольного приложения передается строка слов, разделенных пробелами. Твоя задача сделать из слов
     анаграммы ("задом наперед") при этом оставив порядок слов неизменными. Результат вывести в консоль. Пример "мама мыла раму" => "амам алым умар"

    При решении задачи нельзя использовать дополнительную память. В том числе, когда это происходит в неявном виде
    при вызове функций стандартной библиотеки.
    */
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext("[^\\s]*")) {
            char[] word = sc.next("[^\\s]*").toCharArray();
            for (int i = 0; i < word.length / 2; i++) {
                char buf = word[i];
                word[i] = word[word.length-1 - i];
                word[word.length-1 - i] = buf;
            }
            for(char c:word)System.out.print(c);
            System.out.print(" ");
        }
        System.out.println();
    }
}