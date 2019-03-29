package es.studium.contarPalabra2;
public class clasePrincipal 
{ 
	public static void main(String[] args) 
	{ 
		claseVista Vista = new claseVista();
		claseModelo Modelo = new claseModelo();
		new claseControlador(Vista, Modelo); 
	}
}