package FinalSevenSegment;

import java.util.Arrays;

public class SevenSegmentDisplay {

    static String[] light = new String[7];

    public static void main(String[] args) {
        setLight("10111111");
        displayLight();
    }


    public static void displayLight() {
        System.out.printf("""
                        %s
                        %s        %s
                        %s        %s
                        %s
                        %s        %s
                        %s        %s
                        %s
                        """, light[0], light[5], light[1], light[5], light[1], light[6]
                , light[4], light[2], light[4], light[2], light[3]);


    }


    public static void setLight(String binary) {
        if (String.valueOf(binary.charAt(7)).equals("1")) {
            for (int i = 0; i < light.length; i++) {
                if (String.valueOf(binary.charAt(i)).equals("1")) {
                    if (i == 0 || i == 3 || i == 6) {
                        light[i] = " # # # #";
                    } else {
                        light[i] = "#";
                    }
                } else {
                    light[i] = "";
                }

            }

        } else {
            Arrays.fill(light, "");
        }

    }
}