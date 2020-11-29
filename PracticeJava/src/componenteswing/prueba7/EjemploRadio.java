package componenteswing.prueba7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EjemploRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Radio mimarco=new Marco_Radio();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class Marco_Radio extends JFrame{
	
	public Marco_Radio() {
		

		setBounds(500, 300, 500, 300);
		
		Lamina_Radio milamina=new Lamina_Radio();
		add(milamina);
	}
}

class Lamina_Radio extends JPanel{
	
	public Lamina_Radio() {
		
		setLayout(new BorderLayout());
		texto=new JLabel("El mundo entero lo llora...");
		
		//agregar el texto a la zona central
		add(texto, BorderLayout.CENTER);
		
		 ButtonGroup grupoB1=new ButtonGroup();
		 boton1=new JRadioButton("pequeño", false); 
		 boton2=new JRadioButton("mediano", true);
		 boton3=new JRadioButton("grande", false);
		 boton4=new JRadioButton("muy grande", false);
		 
		 //agregar los botones a una 2da lamina que estará incluida en la 1ra(Lamina_Radio)
		 JPanel lamina_radio=new JPanel();
		 
		 Evento_Radio mievento=new Evento_Radio();
		 boton1.addActionListener(mievento);
		 boton2.addActionListener(mievento);
		 boton3.addActionListener(mievento);
		 boton4.addActionListener(mievento);
		 
		grupoB1.add(boton1);
		grupoB1.add(boton2);
		grupoB1.add(boton3);
		grupoB1.add(boton4);

		lamina_radio.add(boton1);
		lamina_radio.add(boton2);
		lamina_radio.add(boton3);
		lamina_radio.add(boton4);
		 
		 //agregar esta 2da lamina, la que contiene los botones, a la ZONA SUR de la lamina PRINCIPAL
		add(lamina_radio, BorderLayout.SOUTH);
		 
		//agregar interactividad
		
		
	}
	

	private JLabel texto;
	private JRadioButton boton1, boton2, boton3, boton4;
	
	private class Evento_Radio implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			//como DETECTAR si PULSAMOS UN BOTON Y OTRO
			if(e.getSource()==boton1) {
				
				//System.out.println("has pulsado el boton 1");
				texto.setFont(new Font("Serif", Font.PLAIN, 10));
			
			}else if(e.getSource()==boton2) { // 
				
				texto.setFont(new Font("Serif", Font.PLAIN, 12));
				
			}else if(e.getSource()==boton3) { // 
				
				texto.setFont(new Font("Serif", Font.PLAIN, 18));
				
			}else if(e.getSource()==boton4) { // 
				
				texto.setFont(new Font("Serif", Font.PLAIN, 24));
			}
			
		}
	}
}