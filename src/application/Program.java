
package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {

	public static void main(String[] args) {

		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("Minha Carta");
		p.print("Minha Carta");

		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("Meu Email");
		System.out.println("Resultado Scan: " + s.scan());
		
		System.out.println();
		ComboDevice c = new ComboDevice("1991");
		c.processDoc("Minha disertação");
		c.print("Minha disertação");
		System.out.println("Resultado Scan: " + c.scan());
	}
}