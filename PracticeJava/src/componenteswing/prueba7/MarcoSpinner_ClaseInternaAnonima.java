package componenteswing.prueba7;

import java.awt.*;
import java.awt.GraphicsEnvironment;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MarcoSpinner_ClaseInternaAnonima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FrameSpinner2 mimarco=new FrameSpinner2();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class FrameSpinner2 extends JFrame{
	
	public FrameSpinner2() {
		
		setBounds(500, 400, 550, 350);
		setVisible(true);
		
		LaminaSpinner2 milamina=new LaminaSpinner2();
		add(milamina);
	}
}

class LaminaSpinner2 extends JPanel{
	

	public LaminaSpinner2() {
		
		/*//Spinner Fecha
		JSpinner control=new JSpinner(new SpinnerDateModel());
		add(control);*/
		  
		//Spinner Array
		//String lista[]= {"Enero", "Febrero", "Marzo", "Abril", "Mayo"};		
		//String lista[]=GraphicsEnvironnment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		JSpinner control=new JSpinner(new SpinnerNumberModel(5,0,10,1) {
			
			public Object getNextValue() {
				return super.getPreviousValue();
			}
			
			public Object getPreviousValue() {
				return super.getNextValue();
			}
			
		});
		
		Dimension d=new Dimension(70, 20);
		control.setPreferredSize(d);
		
		
		add(control);
		
	}
	
	
	/*private class MiModeloJSpinner extends SpinnerNumberModel{
		
		public MiModeloJSpinner() {
			super(5,0,10,1);
			
		}
		
		public Object getNextValue() {
			return super.getPreviousValue();
		}
		
		public Object getPreviousValue() {
			return super.getNextValue();
		}
	}*/
	
	
}