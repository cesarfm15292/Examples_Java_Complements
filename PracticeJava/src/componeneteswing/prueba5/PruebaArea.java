package componeneteswing.prueba5;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoPruebaArea miMarco=new MarcoPruebaArea();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
		
		
	}

}


class MarcoPruebaArea extends JFrame{
	
	public MarcoPruebaArea() {
		
		setTitle("Probando Area de Texto");
		setBounds(500,300,500,350);
		
		setLayout(new BorderLayout());
		laminaBotones= new JPanel();
		botonInsertar=new JButton("Insertar");
		botonSaltoLinea=new JButton("Salto Linea");
		
		
		botonInsertar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				areaTexto.append("Porque nosotros somos los unicos culpables de lo que nos pasa");
				   
				
			}
			
			
		});
		
		botonSaltoLinea.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				boolean saltar=!areaTexto.getLineWrap(); // =! operador negado 
				
				areaTexto.setLineWrap(saltar);
				
				if(saltar) {
					
					botonSaltoLinea.setText("Quitar Salto");
				}else {
					botonSaltoLinea.setText("Salto Linea");
				}
				
				//botonSaltoLinea.setText(saltar ? "Quitar Salto" : "Salto Linea");
			}
			
		});
		
		laminaBotones.add(botonInsertar);
		laminaBotones.add(botonSaltoLinea);
		
		//AGREGAMOS LA LAMINA A LA ZONA SUR DEL MARCO
		add(laminaBotones, BorderLayout.SOUTH);
		
		//AGREGAR EL AREA DE TEXTO EN LA ZONA NORTE
		areaTexto=new JTextArea(8,20);
		laminaConBarras=new JScrollPane(areaTexto);
		
		add(laminaConBarras, BorderLayout.CENTER);
	}
	
	private JButton botonInsertar, botonSaltoLinea;
	private JPanel laminaBotones;
	private JTextArea areaTexto;
	private JScrollPane laminaConBarras;
}

