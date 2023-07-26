package ConversorTemperatura;

import javax.swing.JOptionPane;

public class FuncionTemperatura {
	
	ConversorTemperatura temperatura = new ConversorTemperatura();
	
	public void ConvertirTemperatura (double entrada) {
		String opcion = (JOptionPane.showInputDialog(null,
				"Elije la temperatura a la quesea convertir:", "Temperatura",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {
						"De Celsius a Farenheit", "De Celsius a Kelvin",
						"De Farenheit a Celsius", "De Farenheit a Kelvin",
						"De Kelvin a Celsius", "De Kelvin a Farenheit",
				}, "Seleccion")).toString();
		
		switch(opcion) {
		case "De Celsius a Farenheit":
			temperatura.ConvertirCelsiusAFarenheit(entrada);
			break;
		case "De Celsius a Kelvin":
			temperatura.ConvertirCelsiusAKelvin(entrada);
			break;
		case "De Farenheit a Celsius":
			temperatura.ConvertirFarenheitACelsius(entrada);
			break;
		case "De Farenheit a Kelvin":
			temperatura.ConvertirFarenheitAKelvin(entrada);
			break;
		case "De Kelvin a Celsius":
			temperatura.ConvertirKelvinACelsius(entrada);
			break;
		case "De Kelvin a Farenheit":
			temperatura.ConvertirKelvinAFarenheit(entrada);
			break;
		}
	}
}