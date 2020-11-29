package componenteswing.prueba7;

import java.awt.Font;

import javax.swing.*;

public class MarcoSliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame_Sliders mimarco=new Frame_Sliders();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Frame_Sliders extends JFrame{
	
	public Frame_Sliders() {
		
		setBounds(500, 300, 550, 400);
		setVisible(true);
		
		Lamina_Sliders milamina=new Lamina_Sliders();
		add(milamina);
	}
}

class Lamina_Sliders extends JPanel{
	
	public Lamina_Sliders() {
		
		JSlider control=new JSlider(0, 100, 50);
		
		control.setMajorTickSpacing(50);
		control.setMinorTickSpacing(25);
		control.setPaintTicks(true);
		control.setFont(new Font("Serif", Font.ITALIC, 12));
		control.setPaintLabels(true);
		control.setSnapToTicks(true);
		add(control);
	}
}