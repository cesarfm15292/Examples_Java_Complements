package componenteswing.prueba7;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Procesado_II3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuProcesador_II3 mimarco=new MenuProcesador_II3();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class MenuProcesador_II3 extends JFrame{
	
	public MenuProcesador_II3() {
		
		setBounds(500, 400, 550, 350);
		//setVisible(true);
		
		LaminaProcesador_II3 milamina=new LaminaProcesador_II3();
		add(milamina);
	}
}

class LaminaProcesador_II3 extends JPanel{
	
	JTextPane miarea;
	JMenu fuente, estilo, tamano;
	Font letras;
	
	
	public LaminaProcesador_II3() {
		
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
		configuraMenu("Arial", "fuente", "Arial", 9, 10);
		configuraMenu("Courier", "fuente", "Courier", 9, 10);
		configuraMenu("Verdana", "fuente", "Verdana", 9, 10);
		
		configuraMenu("Negrita", "estilo", "", Font.BOLD, 1);
		configuraMenu("Cursiva", "estilo", "", Font.ITALIC, 1);
		
		configuraMenu("12", "tamano", "", 9, 12);
		configuraMenu("16", "tamano", "", 9, 16);
		configuraMenu("20", "tamano", "", 9, 20);
		configuraMenu("24", "tamano", "", 9, 24);
		
		
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
	public void configuraMenu(String rotulo, String menu, String tipo_letra, int estilos, int tam  ) {
		
		JMenuItem elem_menu=new JMenuItem(rotulo);
		if(menu=="fuente") {
			fuente.add(elem_menu);
		}else if(menu=="estilo") {
			estilo.add(elem_menu);
		}else if(menu=="tamano") {
			tamano.add(elem_menu);
		}
		
		//PONEMOS LOS ELEMENTOS A LA ESCUCHA
		elem_menu.addActionListener(new GestionEventos(rotulo, tipo_letra, estilos, tam));
	}
	
	private class GestionEventos implements ActionListener{
		
		 /* tipoTexto   = referencia al tipo de letra: Arial, Courier, etc
		  * menu        = detectará que menu es el que hemos pulsado(arial o couier, 20 o 14, cursiva o negrita)
		  *estiloLetra  = para el estilo de la letra
		  *tamanoLetra 	= para el tamaño lentra
		  *
		  *tenemos que pasar los valores de la clase padre a las variables(VARIABLES DE ARRIBA) GestionaEventos(clase hijo) 
		  *
		  * 
		  *DENTROO DEL CONSTRUCTOR le damos valor a estas variables
		  */
		String tipoTexto, menu;
		int estiloLetra, tamanoLetra;
		
		
		/* elemento		= detecta el elemento que hemos pulsado(Ref:  Arial, 20 o negrita)
		 * texto2		= almacena el texto del boton. Si pulso en Arial, Verdana o Cursiva
		 * estilo2		= almacena el estilo de letra que hemos pulsado
		 * tamletra		= almacena el tamaño de letra que hemos pulsleado
		 * */
		 	public GestionEventos(String elemento, String texto2, int estilo2, int tamletra) {
			
			 tipoTexto	= texto2;
			 menu		= elemento;
			 estiloLetra= estilo2; 
			 tamanoLetra= tamletra;
		 	}
		 
		
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			/*ANTES de ESTABLECER el tipo de letra 
			 *
			 * miarea.getFont(), caputra que tipo de letra, tamaño y estio hay en el texto. Eso se almacena en un OBJ de tipo Font(Letras)*/			   
			letras=miarea.getFont();// despues de eso <--------, ahora debemos extraer estilo, tamaño y letra, usando getFontName, getSize, getStyle
			
			if(menu=="Arial" || menu=="Courier" || menu=="Verdana") {

				estiloLetra=letras.getStyle();// estiloLetra almacena el estilo que hay en el texto
				tamanoLetra=letras.getSize();
			}else if(menu=="Cursiva" || menu=="Negrita") {
				
				
				//ARREGLAMOS EL PROBLEMA DE LA NEGRITA Y CURSIVA(cuando cambiabas de fuente dejaba de ser negrita o cursiva)
				if(letras.getStyle()==1 || letras.getStyle()==2) {
					estiloLetra=3;
				}
				
				
				tipoTexto=letras.getFontName();
				tamanoLetra=letras.getSize();
			}else if(menu=="12" || menu=="16" || menu=="20" || menu=="24") {
				
				estiloLetra=letras.getStyle();
				tipoTexto=letras.getFontName();
			}
			
			
			
			//Especificamos 
			miarea.setFont(new Font(tipoTexto, estiloLetra, tamanoLetra));
			
			System.out.println("Tipo: "+ tipoTexto + " Estilo: "+ estiloLetra + "Tamanño: "+tamanoLetra);
		}
		
		
	}

}







