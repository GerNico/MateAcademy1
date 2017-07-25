package matsishin.distance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Distance {

    private static Integer findDistance() {
        Scanner sc = new Scanner(System.in);
        List<Long> longmas = new ArrayList<>();
        Integer min = 0, almost = 0;
        while (sc.hasNextLong()) longmas.add(sc.nextLong());
        if (longmas.size() >= 2) {
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
        } else System.out.println("too small");
        return (min - almost);
    }
}