package ConversorDinero;

import javax.swing.JOptionPane;

public class FuncionDinero {
	
	ConversorDinero dinero = new ConversorDinero();
	ConversorASoles soles = new ConversorASoles();
	
	public void ConvertirMonedas (double entrada) {
		String opcion = (JOptionPane.showInputDialog(null,
				"Elije la moneda a la quesea convertir su dinero:", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {
						"De Soles a Dólares", "De Soles a Euros", "De Soles a Libras", "De Soles a Yenes", "De Soles a Wones",
						"De Dólares a Soles", "De Euros a Soles", "De Libras a Soles", "De Yenes a Soles", "De Wones a Soles"
				}, "Seleccion")).toString();
		
		switch(opcion) {
		case "De Soles a Dólares":
			dinero.ConvertirSolesADolares(entrada);
			break;
		case "De Soles a Euros":
			dinero.ConvertirSolesAEuros(entrada);
			break;
		case "De Soles a Libras":
			dinero.ConvertirSolesALibras(entrada);
			break;
		case "De Soles a Yenes":
			dinero.ConvertirSolesAYen(entrada);
			break;
		case "De Soles a Wones":
			dinero.ConvertirSolesAWon(entrada);
			break;
		case "De Dólares a Soles":
			soles.ConvertirSolesADolares(entrada);
			break;
		case "De Euros a Soles":
			soles.ConvertirSolesAEuros(entrada);
			break;
		case "De Libras a Soles":
			soles.ConvertirSolesALibras(entrada);
			break;
		case "De Yenes a Soles":
			soles.ConvertirSolesAYen(entrada);
			break;
		case "De Wones a Soles":
			soles.ConvertirSolesAWon(entrada);
			break;
		}
	}
}