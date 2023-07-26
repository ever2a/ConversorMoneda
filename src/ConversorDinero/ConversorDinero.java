package ConversorDinero;

import javax.swing.JOptionPane;

public class ConversorDinero {
	public void ConvertirSolesADolares(double valor) {
		double dolar = valor/3.59;
		dolar = (double)Math.round(dolar*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " Soles, son: " + dolar + " Dólares.");
	}
	
	public void ConvertirSolesAEuros(double valor) {
		double euro = valor/3.97;
		euro = (double)Math.round(euro*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " Soles, son: " + euro + " Euros.");
	}
	
	public void ConvertirSolesALibras(double valor) {
		double libra = valor/4.63;
		libra = (double)Math.round(libra*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " Soles, son: " + libra + " Libras.");
	}
	
	public void ConvertirSolesAYen(double valor) {
		double yen = valor/0.025;
		yen = (double)Math.round(yen*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " Soles, son: " + yen + " Yenes.");
	}
	
	public void ConvertirSolesAWon(double valor) {
		double won = valor/0.0028;
		won = (double)Math.round(won*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " Soles, son: " + won + " Wones.");
	}
}