package componenteswing.prueba4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EjemploArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoArea miMarco=new MarcoArea();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoArea extends JFrame{
	
	public MarcoArea() {
		
		setBounds(500, 300, 500, 350);
		
		LaminaArea miLamina=new LaminaArea();
		
		add(miLamina);
		setVisible(true);
	}
}

class LaminaArea extends JPanel{
	
	public LaminaArea() {
		
		
		miarea=new JTextArea(8,20);
		JButton miboton=new JButton("Dale");
		miboton.addActionListener(new GestionaArea());
		
		JScrollPane laminaBarras=new JScrollPane(miarea); 
		
		miarea.setLineWrap(true); // no se ancha el area de texto
		
		add(laminaBarras);
		add(miboton);
	}
	
	private JTextArea miarea;
	
	private class GestionaArea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			System.out.println(miarea.getText());
		}
		
		
	}
}