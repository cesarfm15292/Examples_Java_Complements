package componenteswing.prueba7;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Procesado_II2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuProcesador_II2 mimarco=new MenuProcesador_II2();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class MenuProcesador_II2 extends JFrame{
	
	public MenuProcesador_II2() {
		
		setBounds(500, 400, 550, 350);
		//setVisible(true);
		
		LaminaProcesador_II2 milamina=new LaminaProcesador_II2();
		add(milamina);
	}
}

class LaminaProcesador_II2 extends JPanel{
	
	JTextPane miarea;
	
	
	public LaminaProcesador_II2() {
		
		setLayout(new BorderLayout());
		
		//2da lamina en la parte NORTH
		JPanel laminamenu=new JPanel();

//-----------------------------------------------------------	
		//creamos el menu que estará en la parte NORTH
		JMenuBar mibarra= new JMenuBar();
//-----------------------------------------------------------
		JMenu fuente=new JMenu("Fuente");
		JMenu estilo=new JMenu("Estilo");
		JMenu tamano=new JMenu("Tamaño");
//-----------------------------------------------------------		
		JMenuItem arial=new JMenuItem("Arial");		
		//USANDO CLASES INTERNAS	
		arial.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub			
				
				//cambia el tipo de letra que tenemos en nuesta AREA DE TEXTO
				miarea.setFont(new Font("Arial", Font.PLAIN, 12));			
			}
			
		}); 		
		
		
		
		JMenuItem courier=new JMenuItem("Courier");		
		//USANDO CLASES INTERNAS	
		courier.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub			
				
				//cambia el tipo de letra que tenemos en nuesta AREA DE TEXTO
				miarea.setFont(new Font("Courier", Font.PLAIN, 12));			
			}
			
		});
		
		
		
		JMenuItem verdana=new JMenuItem("Verdana");
		//USANDO CLASES INTERNAS	
		verdana.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub			
				
				//cambia el tipo de letra que tenemos en nuesta AREA DE TEXTO
				miarea.setFont(new Font("Verdana", Font.PLAIN, 12));			
			}
			
		});
		
		
		JMenuItem negrita=new JMenuItem("Negrita");
		JMenuItem cursiva=new JMenuItem("Cursiva");
		JMenuItem generales=new JMenuItem ("generales");
		
		JMenuItem tam_12=new JMenuItem ("12");
		JMenuItem tam_16=new JMenuItem ("16");
		JMenuItem tam_20=new JMenuItem ("20");
		JMenuItem tam_24=new JMenuItem ("24");

		
//-----------------------------------------------------------		
		//agregamos a fuente, estilo y tamaño
		fuente.add(arial);
		fuente.add(courier);
		fuente.add(verdana);
		
		estilo.add(negrita);
		estilo.add(cursiva);


		tamano.add(tam_12);
		tamano.add(tam_16);
		tamano.add(tam_20);
		tamano.add(tam_24);
		

		
//-----------------------------------------------------------		
		
		//agregar los elementos de MENU a la BARRA
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamano);
		
		
//-----------------------------------------------------------		
		//agregar la BARRA a la LAMINA MENU
		laminamenu.add(mibarra);

		
		//indicamos donde va a ir la laminaMenu NORTH, CENTER O SOUTH
		add(laminamenu, BorderLayout.NORTH);
		
		miarea=new JTextPane();
		add(miarea, BorderLayout.CENTER);		
	}	

}







