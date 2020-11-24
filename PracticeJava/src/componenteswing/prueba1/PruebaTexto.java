package componenteswing.prueba1;

import java.awt.*;
	
import java.awt.event.*;


import javax.swing.*;

public class PruebaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoTexto miMarco=new MarcoTexto();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//miMarco.setVisible(true);
		
	}

}

class MarcoTexto extends JFrame{
	
	public MarcoTexto() {
		
		setBounds(600, 300, 600, 350);
		
		LaminaTexto miLamina=new LaminaTexto();
		add(miLamina);
		setVisible(true);
		
	}
}

class LaminaTexto extends JPanel{
	
	public LaminaTexto() {
		
		setLayout(new BorderLayout());
		
		JPanel lamina2=new JPanel();//sublamina de LaminaTexto
		lamina2.setLayout(new FlowLayout());
		
		
		
		
		resultado=new JLabel("", JLabel.CENTER);
		campo1=new JTextField(20);
		JButton miBoton=new JButton("Click");
		JLabel texto1=new JLabel("correo :");
		
		
		DameTexto miEvento=new DameTexto(); 
		
		miBoton.addActionListener(miEvento);
		
		lamina2.add(texto1);
		lamina2.add(campo1);
		add(resultado, BorderLayout.CENTER);
		lamina2.add(miBoton);
		
		//agregamos en la zona norte de la LaminaTexto
		add(lamina2, BorderLayout.NORTH);
		
	}
	
	private JTextField campo1;
	private JLabel resultado;
	
	
	private class DameTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			int arrobaCorrecto=0;
			String email=campo1.getText().trim();
			
			for(int i=0; i<email.length(); i++) {
				
				if(email.charAt(i)=='@') {
					arrobaCorrecto++;
				}
			}
			
			if(arrobaCorrecto!=1) {
				
				resultado.setText("Incorrecto");
			}else {
				resultado.setText("Correcto");
			}
			
			
			
		}
		
	}
	
	
}