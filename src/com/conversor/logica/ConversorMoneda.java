package com.conversor.logica;



/**
 *
 * @author JuanAndres
 */
public class ConversorMoneda {

   // private double valorInicial;
    private double valorConvertido;
    private double[] tasasDeCambio = {1 / 4178.970, 1 / 4598.338, 1 / 5402.816, 1 / 29.698, 1 / 4.646, 4154.06, 4402.63, 5405.800, 29.698, 4.646};

    private final String[] opcionesMonedas = {"De Pesos a Dólar", "De pesos a Euro", "De pesos a libras", "De pesos a Yen",
        "De pesos a Won coreano", "De Dólar a pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos",
        "De Won coreano a Pesos"};

    public String[] getOpcionesMonedas() {
        return opcionesMonedas;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }

    public void setValorConvertido(double valorConvertido) {
        this.valorConvertido = valorConvertido;
    }

    public double[] getTasasDeCambio() {
        return tasasDeCambio;
    }

    public void setTasasDeCambio(double[] tasasDeCambio) {
        this.tasasDeCambio = tasasDeCambio;
    }

    public double convertir(String conversion, double valor) {
        for (int i = 0; i < this.opcionesMonedas.length; i++) {
            if (conversion.equals(this.opcionesMonedas[i])) {
                this.valorConvertido = valor * this.tasasDeCambio[i];
            }
        }
        return this.valorConvertido;

    }

}
