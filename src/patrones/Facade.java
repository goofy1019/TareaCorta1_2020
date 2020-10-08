package patrones;

import java.util.Scanner;

public class Facade {
	public static void CreateSubject() {
		Subject subject = new Subject();
		subject.setState(1000);
		new concreteObserver(subject);
		String cantini = Integer.toString(subject.getState());
		System.out
				.println("Bienvenido al sistema online de la Farmacia Cool™: Pinares");
		System.out.println(" ");
		System.out.println("El sistema fue creado debido a la pandemia por lo que no esta terminado, pero tenemos una "
				+ "promocion de Codeina en frasco gratis!");
		System.out.println(" ");
		System.out.println("En este momento, tenemos " + cantini + " " + "frascos de Codeina disponibles.");
		System.out.println(" ");
		Scanner x = new Scanner(System.in);
		int cantidadA;
		System.out.println("Ingrese la cantidad de frascos que requiere: ");
		System.out.println(" ");
		cantidadA = x.nextInt();
		sistema(cantidadA, subject, x);
	}
	
	private static void sistema(int can, Subject sub, Scanner j) {
		   if (can <= sub.getState()) {
			   String respuesta;
			   Scanner res = new Scanner(System.in);
			   res.toString();
			   System.out.println(" ");
		       sub.setState(sub.getState() - can);
		       System.out.println(" ");
		       System.out.println("Desea realizar otro retiro de Codeina gratuita? (Y/N) ");
		       System.out.println(" ");
		       respuesta = res.nextLine();
		       int si = respuesta.compareTo("Y");
		       int no = respuesta.compareTo("N");
		       if (si == 0) {
		    	   System.out.println(" ");
		    	   System.out.println("Ingrese la cantidad de frascos que requiere: ");
		    	   System.out.println(" ");
		    	   can = j.nextInt();
		    	   sistema(can, sub, j);
		       }else if (no == 0) {
		    	   System.out.println(" ");
		    	   System.out.println("Gracias por su visita, disfrute su Codeina gratuita de parte de Farmacia Cool™: Pinares, pase buen dia!");
		    	   res.close();
		    	   j.close();
		       }else {
		    	   System.out.println(" ");
		    	   System.out.println("No se ha detectado respuesta valida");
		       }
		       
		      } else {
		    	  System.out.println(" ");
		    	  System.out.println("Ya porque estamos regalando frascos de Codeina, no significa que somos"
		    			  + " " + "tontos, vayase a otro lado, adios.");
		    	  j.close();
		      }
	   }

}
