package componenteswing.prueba7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EjemploRadio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Radio2 mimarco=new Marco_Radio2();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

}

class Marco_Radio2 extends JFrame{
	
	public Marco_Radio2() {
		
		setVisible(true);
		setBounds(500, 300, 500, 300);
		
		Lamina_Radio2 milamina=new Lamina_Radio2();
		add(milamina);
	}
}

class Lamina_Radio2 extends JPanel{
	
	private JLabel texto;
	private JRadioButton boton1, boton2, boton3, boton4;
	private ButtonGroup migrupo;
	private JPanel laminabotones;
	
	
	public Lamina_Radio2() {
		
		setLayout(new BorderLayout());
		texto=new JLabel("El mundo entero lo llora...");
		
		texto.setFont(new Font("Serif", Font.PLAIN, 12));
		
		//agregar el texto a la zona central
		add(texto, BorderLayout.CENTER);
		
		laminabotones=new JPanel();
		migrupo=new ButtonGroup();
		
		colocarBotones("Pequeño", false, 10);
		colocarBotones("Mediano", true, 12);
		colocarBotones("Grande", false, 18);
		colocarBotones("Muy Grande", false, 26);
		
		//agregar LAMINA_botones a la ZONA SUR de la LAMINA PRINCIPAL
		add(laminabotones, BorderLayout.SOUTH);
	}
	
	public void colocarBotones(String nombre, boolean seleccionado, int tamano) {
		
		JRadioButton boton=new JRadioButton(nombre, seleccionado);
		
		//todos los botones que se encargue de construir el METODO colocarBotones, lo agregará al grupo con .add
		migrupo.add(boton);
		
		laminabotones.add(boton);
		
		//el boton tiene que responder a una serie de eventos
		ActionListener mievento=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				texto.setFont(new Font("Serif", Font.PLAIN, tamano));
			}
			
		};
		
		boton.addActionListener(mievento);
	}
	

}




