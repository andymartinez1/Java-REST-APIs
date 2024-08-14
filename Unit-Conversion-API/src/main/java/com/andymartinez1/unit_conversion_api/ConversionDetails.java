package com.andymartinez1.unit_conversion_api;

public class ConversionDetails {
    private String fromUnit;
    private float fromValue;
    private String toUnit;
    private float toValue;

    public String getFromUnit() {
        return this.fromUnit;
    }

    public void setFromUnit(String fromUnit) {
        this.fromUnit = fromUnit;
    }

    public float getFromValue() {
        return this.fromValue;
    }

    public void setFromValue(float fromValue) {
        this.fromValue = fromValue;
    }

    public String getToUnit() {
        return this.toUnit;
    }

    public void setToUnit(String toUnit) {
        this.toUnit = toUnit;
    }

    public float getToValue() {
        return this.toValue;
    }

    public void setToValue(float toValue) {
        this.toValue = toValue;
    }

}
