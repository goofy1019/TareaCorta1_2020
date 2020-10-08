package patrones;

public class concreteObserver extends Observer {

	public concreteObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Gracias por su retiro, todavia quedan " + Integer.toString(subject.getState()) + 
	     		  " " + "frascos disponibles!");
	}
}
