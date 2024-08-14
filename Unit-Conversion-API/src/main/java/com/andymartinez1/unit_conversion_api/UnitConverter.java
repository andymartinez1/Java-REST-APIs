package com.andymartinez1.unit_conversion_api;

public class UnitConverter {
    static void convert(ConversionDetails details) {
        String fromUnit = details.getFromUnit();
        String toUnit = details.getToUnit();

        if (fromUnit.equals("km") && toUnit.equals("miles")) {
            LengthConverter.kilometerToMile(details);
        } else if (fromUnit.equals("miles") && toUnit.equals("km")) {
            LengthConverter.milesToKilometer(details);
        }
    }
}
