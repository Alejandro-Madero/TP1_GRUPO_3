package EJERCICIO01;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {

		// Constructores vacios
		Empleado empleado1 = new Empleado();
		System.out.println(empleado1);

		Empleado empleado2 = new Empleado();
		System.out.println(empleado2);

		// Constructores con parametros
		Empleado empleado3 = new Empleado("30111222", "Julian", "Contreras", LocalDate.of(2002, 04, 17), "Masculino", "Av. alla 123", "1122334455", "jjulian.contrerass@gmail.com", "Desarrollador");
		System.out.println(empleado3);

		Empleado empleado4 = new Empleado("27444555", "Laura", "Martinez", LocalDate.of(1985, 11, 3), "Masculino", "Calle Falsa 456", "1166778899", "laura.martinez@gmail.com", "Analista");
		System.out.println(empleado4);

		Empleado empleado5 = new Empleado("35999888", "Roberto", "Carlos", LocalDate.of(1995, 8, 20), "Masculino", "grl.Entre alla 789", "1199001122", "roberxd2@gmail.com", "Tester");
		System.out.println(empleado5);

		// Mostrar proximo legajo
		System.out.println("El proximo legajo será el " + Empleado.devuelveProximoLegajo());
	}

}
