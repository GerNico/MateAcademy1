package matsishin.distance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        findDistance();
    }

    /**
     * Method findDistance
     */
    private static void findDistance() {
        Scanner sc = new Scanner(System.in);
        List<Long> longmas = new ArrayList<>();
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
}