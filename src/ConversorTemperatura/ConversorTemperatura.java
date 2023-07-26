package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
	public void ConvertirCelsiusAFarenheit(double valor) {
		double celsiusFarenheit = valor * 1.8 + 32;
		celsiusFarenheit = (double) Math.round(celsiusFarenheit *100d)/100;
		JOptionPane.showMessageDialog(null, valor + " Grados Celsius son: " + celsiusFarenheit + " Grados Farenheit");
	}
	
	public void ConvertirCelsiusAKelvin(double valor) {
		double celsiusKelvin = valor + 273.152;
		celsiusKelvin = (double) Math.round(celsiusKelvin *100d)/100;
		JOptionPane.showMessageDialog(null, valor + " Grados Celsius son: " + celsiusKelvin + " Grados Kelvin");
	}
	
	public void ConvertirFarenheitACelsius(double valor) {
		double farenheitCelsius = (valor - 32) / 1.8;
		farenheitCelsius = (double) Math.round(farenheitCelsius *100d)/100;
		JOptionPane.showMessageDialog(null, valor + " Grados Farenheit son: " + farenheitCelsius + " Grados Celsius");
	}
	
	public void ConvertirFarenheitAKelvin(double valor) {
		double farenheitKelvin = ((valor - 32) / 1.8) + 273.15;
		farenheitKelvin = (double) Math.round(farenheitKelvin *100d)/100;
		JOptionPane.showMessageDialog(null, valor + " Grados Farenheit son: " + farenheitKelvin + " Grados Kelvin");
	}
	
	public void ConvertirKelvinACelsius(double valor) {
		double kelvinCelsius = valor - 273.152;
		kelvinCelsius = (double) Math.round(kelvinCelsius *100d)/100;
		JOptionPane.showMessageDialog(null, valor + " Grados Kelvin son: " + kelvinCelsius + " Grados Celsius");
	}
	
	public void ConvertirKelvinAFarenheit(double valor) {
		double kelvinFarenheit = ((valor - 273.15) * 1.8) + 32;
		kelvinFarenheit = (double) Math.round(kelvinFarenheit *100d)/100;
		JOptionPane.showMessageDialog(null, valor + " Grados Kelvin son: " + kelvinFarenheit + " Grados Farenheit");
	}
}