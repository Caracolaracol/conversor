package main.currencyConverters;

import main.Main;

import javax.swing.*;

public class CurrencyToPeso {

    ImageIcon image = new ImageIcon("logo.png");

    public void DollarToPeso(String inputValue, boolean isRunning) {
        float peso = 824.2F;
        float value = Float.parseFloat(inputValue);
        float convertedCurrency = value * peso;
        JOptionPane.showMessageDialog(null, "your amount in Pesos is $" + convertedCurrency + " Pesos");
        int convertAgain =  JOptionPane.showConfirmDialog(null, "Do you want to make another conversion?", "Converter", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, image);
        if (convertAgain == 0 ){
            System.out.println("Converting again");
        } else {
            JOptionPane.showMessageDialog(null, "Program terminated");
            Main.setIsRunning(false);
        }
    }

    public void EuroToPeso(String inputValue, boolean isRunning) {
        float peso = 912.27F;
        float value = Float.parseFloat(inputValue);
        float convertedCurrency = value * peso;
        JOptionPane.showMessageDialog(null, "your amount in Pesos is $" + convertedCurrency + " Pesos");
        int convertAgain =  JOptionPane.showConfirmDialog(null, "Do you want to make another conversion?", "Converter", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, image);
        if (convertAgain == 0 ){
            System.out.println("Converting again");
        } else {
            JOptionPane.showMessageDialog(null, "Program terminated");
            Main.setIsRunning(false);
        }
    }

    public void PoundToPeso(String inputValue, boolean isRunning) {
        float peso = 1024.33F;
        float value = Float.parseFloat(inputValue);
        float convertedCurrency = value * peso;
        JOptionPane.showMessageDialog(null, "your amount in Pesos is $" + convertedCurrency + " Pesos");
        int convertAgain = JOptionPane.showConfirmDialog(null, "Do you want to make another conversion?", "Converter", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, image);
        if (convertAgain == 0) {
            System.out.println("Converting again");
        } else {
            JOptionPane.showMessageDialog(null, "Program terminated");
            Main.setIsRunning(false);
        }
    }
}
