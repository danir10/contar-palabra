package es.studium.contarPalabra2;

import java.util.StringTokenizer;

public class claseControlador
{
	public static int contarPalabras() {
		

		
	StringTokenizer st = new StringTokenizer(claseVista.txtCampo2.getText());
	Integer palabras  = st.countTokens();
	claseVista.etiquetanumeropalabras.setText( "total palabras:" +palabras.toString());
	return palabras;	
	
	
		}
}
