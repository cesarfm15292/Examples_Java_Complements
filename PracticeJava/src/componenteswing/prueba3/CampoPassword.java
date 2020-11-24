package componenteswing.prueba3;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class CampoPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoPassword miMarco=new MarcoPassword();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class MarcoPassword extends JFrame{
	
	public MarcoPassword() {
		
		setBounds(500, 300, 500, 350);
		
		LaminaPassword miLamina=new LaminaPassword();
		
		add(miLamina);
		setVisible(true);
		
			
	}
}

class LaminaPassword extends JPanel{
	
	public LaminaPassword() {
		
		setLayout(new BorderLayout()); // Lamina Pricipal BorderLayout, Lamina hijo Grid
		
		JPanel laminaSup=new JPanel();
		laminaSup.setLayout(new GridLayout(2,2));
		add(laminaSup, BorderLayout.NORTH);
		
		JLabel etiqueta1=new JLabel("Usuario");
		JLabel etiqueta2=new JLabel("Contraseña");
		
		JTextField c_usuario=new JTextField(15);
		c_contra=new JPasswordField(15);
		
		CompruebaPass mi_evento=new CompruebaPass();
		
		c_contra.getDocument().addDocumentListener(mi_evento);
		
		laminaSup.add(etiqueta1);
		laminaSup.add(c_usuario);
		laminaSup.add(etiqueta2);
		laminaSup.add(c_contra);
		
		JButton enviar=new JButton("Enviar");
		
		add(enviar, BorderLayout.SOUTH);
	}
	
	JPasswordField c_contra;
	
	
	private class CompruebaPass implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
			char[] contrasena;
			
			contrasena=c_contra.getPassword();
			
			
			//evaluamos la longitud del arraway
			if(contrasena.length<8 || contrasena.length>12) {
				
				c_contra.setBackground(Color.red);
			}else {
				c_contra.setBackground(Color.white);
			}
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
}

