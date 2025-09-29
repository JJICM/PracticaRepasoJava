package practica.psp.dam.Vista;

import java.util.List;
import java.util.Scanner;

import practica.psp.dam.Modelo.Alumnos;

public class AlumnosVista implements VistaInterfaz{
    
    public static final int OPCION_CREAR_ALUMNO = 1;
    public static final int OPCION_LISTAR_ALUMNO = 2;
    public static final int OPCION_SALIR = 3;

    private Scanner sc;

    @Override
    public int opcionMenu() {
        String opciones = """
            %d - Crear alumno.
            %d - Listar alumno.
            %d - Salir.
            """.formatted(OPCION_CREAR_ALUMNO, OPCION_LISTAR_ALUMNO, OPCION_SALIR);
        System.out.println(opciones);

        sc = new Scanner(System.in);
        int opcion = 0;
        opcion = Integer.parseInt(sc.nextLine());

        return opcion;
    }

    @Override
    public Alumnos crearAlumnos() {
        sc = new Scanner(System.in);
        System.out.println("Nombre del alumno: ");
        String nombre = sc.nextLine();
        System.out.println("Apellidos del alumno: ");
        String apellidos = sc.nextLine();
        int edad = -1;
        while (edad < 0) {
            try {
            System.out.println("Edad del alumno: ");
            edad = Integer.parseInt(sc.nextLine());
            if (edad < 0) {
                System.out.println("La edad debe ser positivo");
            }
            } catch (NumberFormatException nfe) {
                System.out.println("La edad debe ser un número");
            }
        }
        return new Alumnos(nombre, apellidos, edad);
    }

    @Override
    public void listarAlumnos(List<Alumnos> alumnos) {
        for (Alumnos alumno : alumnos) {
            String mostrarDatos = """
            ALUMNO
            Nombre: %s
            Apellidos: %s
            Edad: %s
            """.formatted(alumno.getNombre(), alumno.getApellidos(), Integer.toString(alumno.getEdad()));
            System.out.println(mostrarDatos);
        }
    }
}
