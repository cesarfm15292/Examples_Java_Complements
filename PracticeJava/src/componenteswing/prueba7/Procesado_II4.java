package componenteswing.prueba7;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.*;
import javax.swing.text.StyledEditorKit.FontSizeAction;

public class Procesado_II4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuProcesador_II4 mimarco=new MenuProcesador_II4();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class MenuProcesador_II4 extends JFrame{
	
	public MenuProcesador_II4() {
		
		setBounds(500, 400, 550, 350);
		setVisible(true);
		
		LaminaProcesador_II4 milamina=new LaminaProcesador_II4();
		add(milamina);
	}
}

class LaminaProcesador_II4 extends JPanel{
	
	JTextPane miarea;
	JMenu fuente, estilo, tamano;
	Font letras;
	
	public LaminaProcesador_II4() {
		
		setLayout(new BorderLayout());
		
		//2da lamina en la parte NORTH
		JPanel laminamenu=new JPanel();

//-----------------------------------------------------------	
		//creamos el menu que estará en la parte NORTH
		JMenuBar mibarra= new JMenuBar();
//-----------------------------------------------------------
		fuente=new JMenu("Fuente");
		estilo=new JMenu("Estilo");
		tamano=new JMenu("Tamaño");
//-----------------------------------------------------------
		configuraMenu("Arial20", "fuente", "Arial", 9, 10,"");
		configuraMenu("Courier", "fuente", "Courier", 9, 10,"");
		configuraMenu("Verdana", "fuente", "Verdana", 9, 10,"");
		
		configuraMenu("Negrita", "estilo", "", Font.BOLD, 1, "bin/apsgraficas/prueba11/ic_copy.png");
		configuraMenu("Cursiva", "estilo", "", Font.ITALIC, 1, "bin/apsgraficas/prueba11/ic_paste.png");
		
		configuraMenu("12", "tamano", "", 9, 12,"");
		configuraMenu("16", "tamano", "", 9, 16,"");
		configuraMenu("20", "tamano", "", 9, 20,"");
		configuraMenu("24", "tamano", "", 9, 24,"");
		
		
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
	
	/*rotulo	= especifica SI EL TEXTO es ARIAL, VERDANA, NEGRITA, CURSIVA, 20 O 25
	 *menu  	= especifica si el elemento que estamos creando tiene que ir al MENU FUENTE, ESTILO O TAMAÑO
	 *tipo_letra= especifica para los elementos que cuelgan de tipo FONT, el tipo de letra	ARIAL, VERDANA, CURSIVA
	 *estilo    = especifica si el texto está en NEGRITA, CURSIVA.
	 *tamano	= tamaño de la fuente
	 * */
	public void configuraMenu(String rotulo, String menu, String tipo_letra, int estilos, int tam, String rutaIcon){
		
		JMenuItem elem_menu=new JMenuItem(rotulo, new ImageIcon(rutaIcon));
		
		
		if(menu=="fuente") {
			
			fuente.add(elem_menu);
			
			if(tipo_letra=="Arial") {
				//ponemos el elemento de menu(fuente) a la escucha
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia letra", "Arial"));
			}else if(tipo_letra=="Courier") {
				//ponemos el elemento de menu(fuente) a la escucha
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia letra", "Courier"));
			}else if(tipo_letra=="Verdana") {
				//ponemos el elemento de menu(fuente) a la escucha
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia letra", "Verdana"));
			}
			
			
		}else if(menu=="estilo") {
			
			estilo.add(elem_menu);
			
			if(estilos==Font.BOLD) {				
				//ponemos el elemento de menu(estilo) a la escucha
				elem_menu.addActionListener(new StyledEditorKit.BoldAction());
			}else if(estilos==Font.ITALIC) {				
				//ponemos el elemento de menu(estilo) a la escucha
				elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
			}

			
		}else if(menu=="tamano") {
			
			tamano.add(elem_menu);
			  
			/*	1.-ponemos el elemento de menu(tamaño) a la escucha			 * 
			 *	2.-"cambiar tamaño" se vuelve irrelevante porq solo cambiaremos el tamaño y lo ponemos porque necesita un parametro
			 *	string de todas formas*/
			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño", tam));
			
		}
		
		//PONEMOS LOS ELEMENTOS A LA ESCUCHA

		
		}	


	}








