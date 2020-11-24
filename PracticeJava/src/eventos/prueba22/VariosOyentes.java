package eventos.prueba22;

import java.awt.event.*;
import javax.swing.*;

public class VariosOyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoPrincipal miMarco=new MarcoPrincipal();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}


class MarcoPrincipal extends JFrame{
	
	public MarcoPrincipal() {
		
		setTitle("Ejercicios Eventos");
		setBounds(1300, 100, 300, 200);
		
		LaminaPrincipal miLamina=new LaminaPrincipal();
		add(miLamina);
		
	}
}

class LaminaPrincipal extends JPanel{
	
	public LaminaPrincipal() {
		
		JButton boton_nuevo=new JButton("nuevo");// NO SE USARA FUERA DEL CONSTRUCTOR
		JButton boton_cerrar=new JButton("cerrar");
		
		add(boton_nuevo);
		add(boton_cerrar);
		
		//Creamos una fuente de evento con el boton_nuevo
		OyenteNuevo miOyente=new OyenteNuevo();
		boton_nuevo.addActionListener(miOyente);
		
		
		
	}
	
	private class OyenteNuevo implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
 
		  //Se puede hacer tambien el CONSTRUCTOR de la clase MarcoEmergente	
			Marco_Emergente marco=new Marco_Emergente(boton_cerrar);
			marco.setVisible(true);			
		}
	}
	
	JButton boton_cerrar;  //SE UTILIZARA EN OTROS METODOS DE LA CLASE Y NO SOLAMENTE EN EL CONSTRUCTOR

}



class Marco_Emergente extends JFrame{
	
	public Marco_Emergente(JButton boton_de_principal) {
		contador++;
		setTitle("Vetana "+contador);
		setBounds(40*contador, 40*contador,300,150);
		
		CierraTodos oyenteCerrar=new CierraTodos();
		boton_de_principal.addActionListener(oyenteCerrar);
		
	}
	
	private class CierraTodos implements ActionListener{


		public void actionPerformed(ActionEvent e) {

			dispose();  
		}
		
	}
	
	private static int contador=0;
}



