package Coversor.ui;

import javax.swing.JOptionPane;

public class Conversor {
    public static void main(String[] args) {

        Object[] possibleConverter = { "Currency converter", "Temperature converter" };
        Object[] possibleCurrencies = {
                "From Peso to Dollar",
                "From Peso to Euro",
                "From peso to Pounds",
                "From Peso to Yen",
                "From Peso to Korean Won",
                "From Dollar to Peso",
                "From Euro to Peso",
                "From Pounds to Peso"
        };
        Object selectedConverter = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "conversor de moneda", JOptionPane.INFORMATION_MESSAGE, null, possibleConverter, possibleConverter[0]);
        if (selectedConverter == possibleConverter[0]) {
            String inputValue = JOptionPane.showInputDialog("Please input a value of the currency you want to convert");
            Object selectedCurrency = JOptionPane.showInputDialog(null, "Select a currency you want to convert", "conversor de moneda", JOptionPane.INFORMATION_MESSAGE, null, possibleCurrencies, possibleCurrencies[0]);

            if (selectedCurrency == "From Peso to Dollar") {
                float pesoForDollar = 806.2F;
                float value = Float.parseFloat(inputValue);
                float convertedCurrency = value * pesoForDollar;
                System.out.println("your amount in Pesos is $" + convertedCurrency + " Pesos");
            }
        } else if (selectedConverter == possibleConverter[1]){
            String inputValue = JOptionPane.showInputDialog("Please input a value of the temperature");
        }
    }
}
