/* Este codigo ha sido generado por el modulo psexport 20140114-l64 de PSeInt
dado que dicho modulo se encuentra aun en desarrollo y en etapa experimental
puede que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "EJERCICIO6.java."

import java.io.*;

public class ejercicio6 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada=new BufferedReader(new InputStreamReader(System.in));
		String letra;
		System.out.println("Ingrese una letra");
		letra=bufEntrada.readLine();
		switch (letra) {
		case "a":
			System.out.println("La letra "+letra+" es una vocal");
			break;
		case "e":
			System.out.println("La letra "+letra+" es una vocal");
			break;
		case "i":
			System.out.println("La letra "+letra+" es una vocal");
			break;
		case "o":
			System.out.println("La letra "+letra+" es una vocal");
			break;
		case "u":
			System.out.println("La letra "+letra+" es una vocal");
			break;
		default:
			System.out.println("La letra "+letra+" es una consonante");
		}
	}


}

