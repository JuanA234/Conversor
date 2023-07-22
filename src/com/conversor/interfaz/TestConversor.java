package com.conversor.interfaz;

import com.conversor.ConversorMoneda;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanAndres
 */
public class TestConversor {

    public static void main(String[] args) {
        boolean bandera = true;
        String[] conversionesPosibles = {"Conversor de monedas", "Conversor de temperatura"};
        ConversorMoneda cm = new ConversorMoneda();

        String valorSeleccionado = JOptionPane.showInputDialog(null,
                "Seleccione una opción de conversión", "Menu",
                JOptionPane.PLAIN_MESSAGE, null,
                conversionesPosibles, conversionesPosibles[0]).toString();
        
        while(bandera){
            
            try {
                double inputValue = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero que deseas convertir"));
                String monedaSeleccionada = JOptionPane.showInputDialog(null,
                        "Elija la moneda a la que deseas convertir tu dinero", "Monedas",
                        JOptionPane.PLAIN_MESSAGE, null,
                        cm.getOpcionesMonedas(), cm.getOpcionesMonedas()[0]).toString();

                double valorConvertido = cm.convertir(monedaSeleccionada, inputValue);
                DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
                separadoresPersonalizados.setDecimalSeparator('.');

                DecimalFormat formato = new DecimalFormat("#.###", separadoresPersonalizados);
                JOptionPane.showMessageDialog(null, "Tienes " + formato.format(valorConvertido));
             

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "valor no valido");
                System.out.println(ex.getMessage());
            }
            int opcion =    JOptionPane.showConfirmDialog(null,
                 "¿Desea continuar?",  "Select an Option",JOptionPane.YES_NO_CANCEL_OPTION);
            if(opcion == 1||opcion == 2){
                bandera = false;
            }
        }

        JOptionPane.showMessageDialog(null, "Programa terminado");

    }

}
