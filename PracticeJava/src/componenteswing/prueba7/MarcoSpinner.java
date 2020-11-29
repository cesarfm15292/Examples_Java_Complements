package componenteswing.prueba7;

import java.awt.*;
import java.awt.GraphicsEnvironment;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MarcoSpinner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FrameSpinner mimarco=new FrameSpinner();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class FrameSpinner extends JFrame{
	
	public FrameSpinner() {
		
		setBounds(500, 400, 550, 350);
		setVisible(true);
		
		LaminaSpinner milamina=new LaminaSpinner();
		add(milamina);
	}
}

class LaminaSpinner extends JPanel{
	

	public LaminaSpinner() {
		
		/*//Spinner Fecha
		JSpinner control=new JSpinner(new SpinnerDateModel());
		add(control);*/
		  
		//Spinner Array
		//String lista[]= {"Enero", "Febrero", "Marzo", "Abril", "Mayo"};		
		//String lista[]=GraphicsEnvironnment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		JSpinner control=new JSpinner(new MiModeloJSpinner());
		
		Dimension d=new Dimension(70, 20);
		control.setPreferredSize(d);
		
		
		add(control);
		
	}
	
	
	private class MiModeloJSpinner extends SpinnerNumberModel{
		
		public MiModeloJSpinner() {
			super(5,0,10,1);
			
		}
		
		public Object getNextValue() {
			return super.getPreviousValue();
		}
		
		public Object getPreviousValue() {
			return super.getNextValue();
		}
	}
	
	
}