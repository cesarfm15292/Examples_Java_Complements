package componenteswing.prueba7;

import javax.swing.*;

public class Sintaxis_Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco_Radio_Sintaxis mimarco=new Marco_Radio_Sintaxis();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco_Radio_Sintaxis extends JFrame{
	
	public Marco_Radio_Sintaxis() {
		
		setVisible(true);
		setBounds(500, 300, 500, 300);
		
		Lamina_Radio_Sintaxis milamina=new Lamina_Radio_Sintaxis();
		add(milamina);
	}
}

class Lamina_Radio_Sintaxis extends JPanel{
	
	public Lamina_Radio_Sintaxis() {
		
		ButtonGroup grupoB1=new ButtonGroup();
		ButtonGroup grupoB2=new ButtonGroup();
		
		JRadioButton boton1=new JRadioButton("azul", false); //"azul", false=color azul y el elemento no esta seleccionado
		JRadioButton boton2=new JRadioButton("rojo", true);
		JRadioButton boton3=new JRadioButton("verde", false);
		JRadioButton boton4=new JRadioButton("masculino", false);
		JRadioButton boton5=new JRadioButton("femenino", false);
		
		//agregamos los botones al grupo grupoB1
		grupoB1.add(boton1);
		grupoB1.add(boton2);
		grupoB1.add(boton3);
		grupoB2.add(boton4);
		grupoB2.add(boton5);
		
		//agregamos los botones a la lamina Lamina_Radio_Sintaxis
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		add(boton5);
		
		
	}
}


