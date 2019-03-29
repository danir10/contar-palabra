package es.studium.contarPalabra2;

import java.util.StringTokenizer;

public class claseModelo
{
	public static int contarPalabras(String texto) {
				
	StringTokenizer st = new StringTokenizer(claseVista.txtCampo2.getText());
	Integer palabras  = st.countTokens();
	claseVista.etiquetanumeropalabras.setText( "total palabras:" +palabras.toString());
	return palabras;	
	
	
		}

}
