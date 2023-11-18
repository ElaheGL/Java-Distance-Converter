package com.example.converter;

import javax.swing.*;

public class Converter {
    public static void main(String[] args){
        double userEnter = Double.parseDouble
                (JOptionPane.showInputDialog(null,"How many meters?"));
        double CalculateMile = mile(userEnter);
        double CalculateKM = kilometres(userEnter);
        double CalculateCM = centimetres(userEnter);
        JOptionPane.showMessageDialog(null,
                "your number is "+CalculateMile + " Miles\n "+ CalculateKM + " 10001Kilometers\n"
        +CalculateCM+" Centemeters");

    }
    private static double mile(double mile){
        final double Mile = 0.00062;
        return (mile * Mile);
    }
    private static double kilometres(double KM){
        final double kilometer =0.001;
        return (kilometer * KM);
    }
    private static double centimetres(double CM){
        final double centimeter = 100;
        return (CM * centimeter);
    }
}
