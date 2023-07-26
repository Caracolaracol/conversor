package main.currencyConverters;

import main.Main;
import javax.swing.*;

public class pesoToCurrency {
    ImageIcon image = new ImageIcon("logo.png");
    public void pesoToDollar(String inputValue, boolean isRunning) {
        float pesoForDollar = 824.2F;
        float value = Float.parseFloat(inputValue);
        float convertedCurrency = value / pesoForDollar;
        JOptionPane.showMessageDialog(null, "your amount in Dollar is $" + convertedCurrency + " USD Dollars");
        int convertAgain =  JOptionPane.showConfirmDialog(null, "Do you want to make another conversion?", "Converter", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, image);
        if (convertAgain == 0 ){
            System.out.println("Converting again");
        } else {
            JOptionPane.showMessageDialog(null, "Program terminated");
            Main.setIsRunning(false);
        }
    }

    public void pesoToEuro(String inputValue, boolean isRunning) {
        float pesoForEuro = 912.27F;
        float value = Float.parseFloat(inputValue);
        float convertedCurrency = value / pesoForEuro;
        JOptionPane.showMessageDialog(null, "your amount in Euro is $" + convertedCurrency + " Euros");
        int convertAgain =  JOptionPane.showConfirmDialog(null, "Do you want to make another conversion?", "Converter", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, image);
        if (convertAgain == 0 ){
            System.out.println("Converting again");
        } else {
            JOptionPane.showMessageDialog(null, "Program terminated");
            Main.setIsRunning(false);
        }
    }

    public void pesoToPounds(String inputValue, boolean isRunning) {
        float pesoForPounds = 1064.33F;
        float value = Float.parseFloat(inputValue);
        float convertedCurrency = value / pesoForPounds;
        JOptionPane.showMessageDialog(null, "your amount is $" + convertedCurrency + " Pounds");
        int convertAgain =  JOptionPane.showConfirmDialog(null, "Do you want to make another conversion?", "Converter", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, image);
        if (convertAgain == 0 ){
            System.out.println("Converting again");
        } else {
            JOptionPane.showMessageDialog(null, "Program terminated");
            Main.setIsRunning(false);
        }
}
    public void pesoToYen(String inputValue, boolean isRunning) {
        float pesoForYen = 5.86F;
        float value = Float.parseFloat(inputValue);
        float convertedCurrency = value / pesoForYen;
        JOptionPane.showMessageDialog(null, "your amount in Yen is $" + convertedCurrency + " Yen");
        int convertAgain =  JOptionPane.showConfirmDialog(null, "Do you want to make another conversion?", "Converter", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, image);
        if (convertAgain == 0 ){
            System.out.println("Converting again");
        } else {
            JOptionPane.showMessageDialog(null, "Program terminated");
            Main.setIsRunning(false);
        }
    }

    public void pesoToWon(String inputValue, boolean isRunning) {
        float pesoForWon = 0.65F;
        float value = Float.parseFloat(inputValue);
        float convertedCurrency = value / pesoForWon;
        JOptionPane.showMessageDialog(null, "your amount in Korean Won is $" + convertedCurrency + " Won");
        int convertAgain =  JOptionPane.showConfirmDialog(null, "Do you want to make another conversion?", "Converter", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, image);
        if (convertAgain == 0 ){
            System.out.println("Converting again");
        } else {
            JOptionPane.showMessageDialog(null, "Program terminated");
            Main.setIsRunning(false);
        }
    }

}
