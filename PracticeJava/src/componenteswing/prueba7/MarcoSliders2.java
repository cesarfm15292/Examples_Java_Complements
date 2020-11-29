package componenteswing.prueba7;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MarcoSliders2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame_Sliders2 mimarco=new Frame_Sliders2();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Frame_Sliders2 extends JFrame{
	
	public Frame_Sliders2() {
		
		setBounds(500, 400, 550, 350);
		setVisible(true);
		
		Lamina_Sliders2 milamina=new Lamina_Sliders2();
		add(milamina);
	}
}

class Lamina_Sliders2 extends JPanel{
	
	private JLabel rotulo;
	private JSlider control;
	//private static int contador;
	
	public Lamina_Sliders2() {
		
		setLayout(new BorderLayout());
		rotulo=new JLabel("el mundo entero lo llora...");
		
		add(rotulo, BorderLayout.CENTER);
		
		//crear slider en la 2da lamina
		control=new JSlider(8,50,12);
		
		control.setMajorTickSpacing(20);
		control.setMinorTickSpacing(5);
		control.setPaintTicks(true);
		control.setPaintLabels(true);
		control.setFont(new Font("Serif", Font.ITALIC, 10));
		
		//Creamos una 2da lamina que ira arriba
		JPanel laminaSliderNorth=new JPanel ();
		
		//Agregar el slider a la lamina
		laminaSliderNorth.add(control);
		
		//Agregar la lamina a la zona NORTE
		add(laminaSliderNorth, BorderLayout.NORTH);
		
		//poner el slider a la escucha
		control.addChangeListener(new EventoSlider());
		
		
		
	}
	
	private class EventoSlider implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			
			//contador++;
			//System.out.println("Estas manipulando el slider: "+ control.getValue());
			
			
			rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));
			
			
		}
		
	}
	
}