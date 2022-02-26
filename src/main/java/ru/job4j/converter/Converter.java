package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(120);
        float inRTE = 140;
        float expectedRTE = 2;
        float outRTE = Converter.rubleToEuro(inRTE);
        boolean passedRTE = expectedRTE == outRTE;
        float inRTD = 120;
        float expectedRTD = 2;
        float outRTD = Converter.rubleToDollar(inRTD);
        boolean passedRTD = expectedRTD == outRTD;
        System.out.println("140 rubles are " + euro + " euro." + "Test result: " + passedRTE);
        System.out.println("120 rubles are " + dollar + " dollars." + "Test result: " + passedRTD);
    }
}
