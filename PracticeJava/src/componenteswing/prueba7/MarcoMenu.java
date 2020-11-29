package componenteswing.prueba7;

import javax.swing.*;

public class MarcoMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuFrame mimarco=new MenuFrame();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class MenuFrame extends JFrame{
	
	public MenuFrame() {
		
		setBounds(500, 400, 550, 350);
		
		MenuLamina milamina=new MenuLamina();
		add(milamina);
	}
}

class MenuLamina extends JPanel{
	

	public MenuLamina() {
		
		JMenuBar mibarra=new JMenuBar();
		
		JMenu	 archivo=new JMenu("Archivo");
		JMenu	 edicion=new JMenu("Edición");
		JMenu	 herramientas=new JMenu("Herramientas");
		JMenu	 opciones=new JMenu("Opciones");
		
		
		
		//agregamos los elementos que colgaran de archivos, edicion y herramientas. ANTES DE USAR EL metodo ADD
		JMenuItem guardar=new JMenuItem("Guardar");
		JMenuItem guardar_como=new JMenuItem("Guardar Como");
		JMenuItem cortar=new JMenuItem("Cortar");
		JMenuItem copiar=new JMenuItem("copiar");
		JMenuItem pegar=new JMenuItem("pegar");
		JMenuItem generales=new JMenuItem ("generales");
		
		JMenuItem opcion1=new JMenuItem ("opcion1");
		JMenuItem opcion2=new JMenuItem ("opcion2");
		
		
		
		
		
		
		//Le decimos al programa cada uno de los elemenos creado en que menu tiene que ir
		archivo.add(guardar);
		archivo.add(guardar_como);
		
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);	
		
		//separadores  addSeparator()
		edicion.addSeparator();
		
		edicion.add(opciones);
		
		herramientas.add(generales); 
		
		opciones.add(opcion1);
		opciones.add(opcion2);
		
		
		
		
		
		
		//agregamos los elementos a la barra
		mibarra.add(archivo);
		mibarra.add(edicion);
		mibarra.add(herramientas);	
		
		
		
		
		//agregamos barra de menu a la lamina
		add(mibarra);
		
		
		
		
		
	}
}