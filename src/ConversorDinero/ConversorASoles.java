package ConversorDinero;

import javax.swing.JOptionPane;

public class ConversorASoles {
	public void ConvertirSolesADolares(double valor) {
		double dolar = valor*3.59;
		dolar = (double)Math.round(dolar*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " Dólares, son: " + dolar + " Soles.");
	}
	
	public void ConvertirSolesAEuros(double valor) {
		double euro = valor*3.97;
		euro = (double)Math.round(euro*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " Euros, son: " + euro + " Soles.");
	}
	
	public void ConvertirSolesALibras(double valor) {
		double libra = valor*4.63;
		libra = (double)Math.round(libra*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " Libras, son: " + libra + " Soles.");
	}
	
	public void ConvertirSolesAYen(double valor) {
		double yen = valor*0.025;
		yen = (double)Math.round(yen*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " Yenes, son: " + yen + " Soles.");
	}
	
	public void ConvertirSolesAWon(double valor) {
		double won = valor*0.0028;
		won = (double)Math.round(won*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " Wones, son: " + won + " Soles.");
	}
}