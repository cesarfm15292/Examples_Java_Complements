package componenteswing.prueba7;

import java.awt.BorderLayout;

import javax.swing.*;

public class MarcoEmergente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MargoEmergenteMenu mimarco=new MargoEmergenteMenu();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class MargoEmergenteMenu extends JFrame{
	
	public MargoEmergenteMenu() {
		
		setBounds(100, 100, 300, 250);
		LaminaEmergenteMenu milamina=new LaminaEmergenteMenu();
		add(milamina);
		//setVisible(true);
	}
}

class LaminaEmergenteMenu extends JPanel{
	
	JPopupMenu mEmergente;
	
	public LaminaEmergenteMenu() {
		
		setLayout(new BorderLayout());
		JPanel laminamenu=new JPanel();
		
		JMenuBar mibarra=new JMenuBar();
		
		JMenu fuente=new JMenu("Fuente");
		JMenu estilo=new JMenu("Estilo");
		JMenu tamano=new JMenu("Tamaño");
		
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamano);
		
		laminamenu.add(mibarra);
		
		add(laminamenu, BorderLayout.NORTH);
//---------------------------------------------------------------------------------------
		//JTextArea
		JTextPane miarea=new JTextPane();
		add(miarea, BorderLayout.CENTER);
//---------------------------------------------------------------------------------------		
		
		
		
		mEmergente=new JPopupMenu();
		
		//agregamos items que queremos que aparezcan en el menu emergente
		JMenuItem opc1=new JMenuItem("Opcion 1");
		JMenuItem opc2=new JMenuItem("Opcion 2");
		JMenuItem opc3=new JMenuItem("Opcion 3");
		
		mEmergente.add(opc1);
		mEmergente.add(opc2);
		mEmergente.add(opc3);
		
		miarea.setComponentPopupMenu(mEmergente);
	}
}