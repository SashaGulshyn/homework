package src.home_work_2.loops;

import src.home_work_2.loops.Point1_5Main;

public class Point1_5 {

    static public long maxFromUser(long user) {
        long max = user % 10;
        long counter = user / 10;
        do {
            if (counter % 10 > max) max = counter % 10;
            counter = counter / 10;
        } while (counter > 0);
        return max;
    }
}
