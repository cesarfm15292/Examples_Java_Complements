package componeneteswing.prueba6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaChecks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCheck miMarco=new MarcoCheck();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
		
	}

}


class MarcoCheck extends JFrame{
	
	public MarcoCheck() {
		
		setBounds(500,300,500,350);
		//setVisible(true);
		
		
		LaminaCheck milamina=new LaminaCheck();
		add(milamina);
		
		
	}
}

class LaminaCheck extends JPanel{
	
	public LaminaCheck() {
		
		setLayout(new BorderLayout());
		Font miLetra=new Font("Serif", Font.PLAIN, 24);
		
		texto=new JLabel("Inmejorable oportunidad de línea de carrera profesional en nuestra consultora líder en el mercado TI.");
		texto.setFont(miLetra);
		
		JPanel laminatexto=new JPanel();
		laminatexto.add(texto);
		
		add(laminatexto, BorderLayout.CENTER);
		
		
		check1=new JCheckBox("negrita");
		check2=new JCheckBox("cursiva");
		
		check1.addActionListener(new ManejaCheck());
		check2.addActionListener(new ManejaCheck());
		
		JPanel laminachecks=new JPanel();
		laminachecks.add(check1);
		laminachecks.add(check2);
		
		add(laminachecks, BorderLayout.SOUTH);
		
		
	}
	
	private class ManejaCheck implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			int tipo=0;
			
			if(check1.isSelected()) tipo+=Font.BOLD;  
			if(check2.isSelected()) tipo+=Font.ITALIC;
			texto.setFont(new Font("Serif", tipo, 24));
			
			//1ra forma con variables booleanas, activando y desactivando los checks
			
			
			
			
		}		
	}
	
	private JLabel texto;
	private JCheckBox check1, check2;
}