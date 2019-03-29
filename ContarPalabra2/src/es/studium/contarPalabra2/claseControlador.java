package es.studium.contarPalabra2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class claseControlador  implements ActionListener, WindowListener 
{

		claseVista objVista = null; 
		claseModelo objModelo = null;

		public claseControlador(claseVista objVista, claseModelo objModelo) {
			this.objVista = objVista;
			this.objModelo = objModelo; 
			objVista.botonejecutar.addActionListener(this);
			objVista.addWindowListener(this); 
		}
		
		public void actionPerformed(ActionEvent evento) { 
			if(objVista.botonejecutar.equals(evento.getSource())) {
				try {
					String texto = (this.objVista.txtCampo2.getText());
					int palabras = objModelo.contarPalabras(texto);
					objVista.etiquetanumeropalabras.setText(""+palabras);
					}
				
				catch(Exception e) {
					e.printStackTrace(); 
				}
			}
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


