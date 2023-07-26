package main.temperatureConverters;

import javax.swing.*;

public class scaleToScale {
    float kelvin = -273.15F;
    public void kelvinToCelsius(String inputValue){

        float value = Float.parseFloat(inputValue);
        float convertedTemperature = value + kelvin;
        JOptionPane.showMessageDialog(null, "The converted temperature to celsius is: " + convertedTemperature + " ° Celsius");

    }
    public void kelvinToFahrenheit(String inputValue){
        float value = Float.parseFloat(inputValue);
        float convertedTemperature = (value - kelvin) * ((float) 9 / 5) + 32;
        JOptionPane.showMessageDialog(null, "The converted temperature to Fahrenheit is: " + convertedTemperature + " ° Fahrenheit");

    }
    public void celsiusToKelvin(String inputValue){
        float value = Float.parseFloat(inputValue);
        float convertedTemperature = value + kelvin;
        JOptionPane.showMessageDialog(null, "The converted temperature to celsius is: " + convertedTemperature + " ° Kelvin");

    }
    public void celsiusToFahrenheit(String inputValue){
        float value = Float.parseFloat(inputValue);
        float convertedTemperature = (value * 9/5) + 32;
        JOptionPane.showMessageDialog(null, "The converted temperature to celsius is: " + convertedTemperature + " ° Fahrenheit");
    }
    public void fahrenheitToKelvin(String inputValue){
        float value = Float.parseFloat(inputValue);
        float convertedTemperature = (value - 32) * 5/9 + 273.15F;
        JOptionPane.showMessageDialog(null, "The converted temperature to Kelvin is: " + convertedTemperature + " ° Kelvin");

    }
    public void fahrenheitToCelsius(String inputValue){
        float value = Float.parseFloat(inputValue);
        float convertedTemperature = (value - 32) * 5/9;
        JOptionPane.showMessageDialog(null, "The converted temperature to celsius is: " + convertedTemperature + " ° celsius");

    }
}
