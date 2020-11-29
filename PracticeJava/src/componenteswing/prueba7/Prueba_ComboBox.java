package componenteswing.prueba7;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Prueba_ComboBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCombo mimarco=new MarcoCombo();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoCombo extends JFrame{
	
	public MarcoCombo() {
		
		setBounds(500, 300, 550, 400);
		setVisible(true);
		
		LaminaCombo milamina=new LaminaCombo();
		add(milamina);
	}
}

class LaminaCombo extends JPanel{
	
	private JLabel texto;
	private JComboBox micombo;
	
	public LaminaCombo() {
		
		//establecer layout
		setLayout(new BorderLayout());
		
		texto=new JLabel("El mundo entero lo llora");
		texto.setFont(new Font("Serif", Font.PLAIN, 18));
		
		add(texto, BorderLayout.CENTER);
		
		//establecemos lamina NORTH
		JPanel laminaNorte=new JPanel();
		
		//creamos el comboBox
		micombo=new JComboBox();
		
		//para que el combo sea EDITABLE
		micombo.setEditable(true);
		
		//AGREMOS ELEMENTOS SL COMBOBOX
		micombo.addItem("Serif");
		micombo.addItem("SansSerif");
		micombo.addItem("Monospaced");
		micombo.addItem("Dialog");
		
		//agregar a la lamina NORTH
		laminaNorte.add(micombo);
		
		//agregar la lamina NORTE a la lamina PRINCIPAL
		add(laminaNorte, BorderLayout.NORTH);
			
		//Instanciar la clase que maneja los eventos(EventoCombo)
		EventoCombo mievento=new EventoCombo();
		
		//poner el comboBox a la escucha
		micombo.addActionListener(mievento);
		
	}
	
	private class EventoCombo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			texto.setFont(new Font((String)micombo.getSelectedItem(), Font.PLAIN, 18));
		}
		
	}
	
}