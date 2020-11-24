package componenteswing.prueba2;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoPrueba miMarco=new MarcoPrueba();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoPrueba extends JFrame{
	
	public MarcoPrueba() {
		
		setBounds(500,300,500,350);
		
		LaminaPrueba miLamina=new LaminaPrueba();
		
		add(miLamina);
		setVisible(true);
		
	}
}

class LaminaPrueba extends JPanel{
	
	public LaminaPrueba() {
		
		JTextField micampo=new JTextField(20);
		
		EscuchaTexto el_evento=new EscuchaTexto();
		
		Document midoc=micampo.getDocument();
		midoc.addDocumentListener(el_evento);
		
		
		add(micampo);
	}
	
	
	private class EscuchaTexto implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
			System.out.println("haz insertado texto");
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
			System.out.println("haz borrado texto");
		}		
		
	}
	
}