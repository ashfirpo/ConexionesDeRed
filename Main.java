package conexionesDeRed;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		Conectar c = new Conectar("conectar.in");
		c.resolver();
	}

}
