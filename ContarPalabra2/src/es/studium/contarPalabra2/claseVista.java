package es.studium.contarPalabra2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



public class claseVista extends Frame implements WindowListener,ActionListener
{
	private static final long serialVersionUID = 1L;	
	
		static TextArea txtCampo2 = new TextArea (5,20);
		static Button botonejecutar = new Button ("Ejecutar");
		static Label etiquetanumeropalabras = new Label ("numero de palabras");
		
		
		Panel panelsuperior = new Panel();
		Panel panelcentral = new Panel();
	
	
		
		
		public  claseVista()
		{
			setTitle("Clase Vista");
			setLayout (new FlowLayout());
			setSize(300,220);
			
			add(txtCampo2);
			add(etiquetanumeropalabras);
			add(botonejecutar);
			
			
			setResizable(false);
			setLocationRelativeTo(null);
			setVisible(true);
		}

	
	
	
	
	
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent arg0)
	{


	}
	@Override
	public void windowActivated(WindowEvent arg0)
	{


	}
	@Override
	public void windowClosed(WindowEvent arg0)
	{


	}
	@Override
	public void windowClosing(WindowEvent arg0)
	{


	}
	@Override
	public void windowDeactivated(WindowEvent arg0)
	{


	}
	@Override
	public void windowDeiconified(WindowEvent arg0)
	{


	}
	@Override
	public void windowIconified(WindowEvent arg0)
	{


	}
	@Override
	public void windowOpened(WindowEvent arg0)
	{


	}
}
