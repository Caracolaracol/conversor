package main.currencyConverters;

import main.Main;
import javax.swing.*;

public class pesoToCurrency {
    ImageIcon image = new ImageIcon("logo.png");
    public void pesoToDollar(String inputValue, boolean isRunning) {
        float pesoForDollar = 806.2F;
        float value = Float.parseFloat(inputValue);
        float convertedCurrency = value * pesoForDollar;
        JOptionPane.showMessageDialog(null, "your amount in Pesos is $" + convertedCurrency + " Pesos");
        int convertAgain =  JOptionPane.showConfirmDialog(null, "Do you want to make another conversion?", "Converter", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, image);
        if (convertAgain == 0 ){
            System.out.println("Converting again");
        } else {
            JOptionPane.showMessageDialog(null, "Program terminated");
            Main.setIsRunning(false);
        }
    }

    public void pesoToEuro(String inputValue, boolean isRunning) {
        float pesoForEuro = 806.2F;
        float value = Float.parseFloat(inputValue);
        float convertedCurrency = value * pesoForEuro;
        JOptionPane.showMessageDialog(null, "your amount in Pesos is $" + convertedCurrency + " Pesos");
        int convertAgain =  JOptionPane.showConfirmDialog(null, "Do you want to make another conversion?", "Converter", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, image);
        if (convertAgain == 0 ){
            System.out.println("Converting again");
        } else {
            JOptionPane.showMessageDialog(null, "Program terminated");
            Main.setIsRunning(false);
        }
    }

    public void pesoToPounds(String inputValue, boolean isRunning) {
        float pesoForPounds = 806.2F;
        float value = Float.parseFloat(inputValue);
        float convertedCurrency = value * pesoForPounds;
        JOptionPane.showMessageDialog(null, "your amount in Pesos is $" + convertedCurrency + " Pesos");
        int convertAgain =  JOptionPane.showConfirmDialog(null, "Do you want to make another conversion?", "Converter", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, image);
        if (convertAgain == 0 ){
            System.out.println("Converting again");
        } else {
            JOptionPane.showMessageDialog(null, "Program terminated");
            Main.setIsRunning(false);
        }
}
    public void pesoToYen(String inputValue, boolean isRunning) {
        float pesoForYen = 806.2F;
        float value = Float.parseFloat(inputValue);
        float convertedCurrency = value * pesoForYen;
        JOptionPane.showMessageDialog(null, "your amount in Pesos is $" + convertedCurrency + " Pesos");
        int convertAgain =  JOptionPane.showConfirmDialog(null, "Do you want to make another conversion?", "Converter", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, image);
        if (convertAgain == 0 ){
            System.out.println("Converting again");
        } else {
            JOptionPane.showMessageDialog(null, "Program terminated");
            Main.setIsRunning(false);
        }
    }

    public void pesoToWon(String inputValue, boolean isRunning) {
        float pesoForWon = 806.2F;
        float value = Float.parseFloat(inputValue);
        float convertedCurrency = value * pesoForWon;
        JOptionPane.showMessageDialog(null, "your amount in Pesos is $" + convertedCurrency + " Pesos");
        int convertAgain =  JOptionPane.showConfirmDialog(null, "Do you want to make another conversion?", "Converter", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, image);
        if (convertAgain == 0 ){
            System.out.println("Converting again");
        } else {
            JOptionPane.showMessageDialog(null, "Program terminated");
            Main.setIsRunning(false);
        }
    }

}
