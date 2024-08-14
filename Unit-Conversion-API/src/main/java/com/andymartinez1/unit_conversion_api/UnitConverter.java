package com.andymartinez1.unit_conversion_api;

public class UnitConverter {
    static void convert(ConversionDetails details) throws UnitConversionException {
        String fromUnit = details.getFromUnit();
        String toUnit = details.getToUnit();

        if (fromUnit.equals("km") && toUnit.equals("miles")) {
            LengthConverter.kilometerToMile(details);
        } else if (fromUnit.equals("miles") && toUnit.equals("km")) {
            LengthConverter.milesToKilometer(details);
        } else {
            throw new UnitConversionException("Invalid From and To units.");
        }
    }
}
