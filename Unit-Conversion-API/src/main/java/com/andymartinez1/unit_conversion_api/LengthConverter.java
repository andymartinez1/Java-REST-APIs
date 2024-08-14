package com.andymartinez1.unit_conversion_api;

public class LengthConverter {
    static void kilometerToMile(ConversionDetails details) {
        float km = details.getFromValue();
        float miles = km * 0.621371f;
        details.setToValue(miles);
    }

    static void milesToKilometer(ConversionDetails details) {
        float miles = details.getFromValue();
        float km = miles * 1.60934f;
        details.setToValue(km);
    }
}
