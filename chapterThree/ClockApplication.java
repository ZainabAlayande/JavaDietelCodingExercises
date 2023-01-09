package chapterThree;

import tdd.Clock;

public class ClockApplication {
    public static void main(String[] args) {

        Clock rolex = new Clock(60, 60, 60);

        rolex.displayTime();

    }
}
