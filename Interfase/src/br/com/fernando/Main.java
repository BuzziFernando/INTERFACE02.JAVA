package br.com.fernando;

public class Main {
	
	
	public static void main(String[] args) {
		ConcreteSubject assunto = new ConcreteSubject();

		ConcreteObserver o1 = new ConcreteObserver("Ferrari");
		ConcreteObserver o2 = new ConcreteObserver("Lamborguini");
		ConcreteObserver o3 = new ConcreteObserver("Mustang");
		ConcreteObserver o4 = new ConcreteObserver("Fiat");

		assunto.attach(o1);
		assunto.attach(o2);
		assunto.attach(o3);
		assunto.attach(o4);
		
		assunto.generateNewNumber();
		System.out.println("------");
		assunto.detach(o3);
		

		assunto.generateNewNumber();
		
	}

}
