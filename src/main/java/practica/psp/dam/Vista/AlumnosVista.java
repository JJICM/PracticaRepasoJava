package practica.psp.dam.Vista;

import java.util.Scanner;

public class AlumnosVista implements VistaInterfaz{
    
    public static final int OPCION_CREAR_ALUMNO = 1;
    public static final int OPCION_LISTAR_ALUMNO = 2;
    public static final int OPCION_SALIR = 3;

    private static final int ATRIBUTOS_ALUMNO = 3;

    @Override
    public int opcionMenu() {
        String opciones = """
            %d - Crear alumno.
            %d - Listar alumno.
            %d - Salir.
            """.formatted(OPCION_CREAR_ALUMNO, OPCION_LISTAR_ALUMNO, OPCION_SALIR);

        System.out.println(opciones);

        Scanner sc = new Scanner(System.in);
        int opcion = Integer.parseInt(sc.nextLine());
        sc.close();

        return opcion;
    }

    @Override
    public String[] crearAlumnos() {
        String[] datosAlumno = new String[ATRIBUTOS_ALUMNO];

        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del alumno: ");
        datosAlumno[0] = sc.nextLine();
        System.out.println("Apellidos del alumno: ");
        datosAlumno[1] = sc.nextLine();
        System.out.println("Edad del alumno: ");
        datosAlumno[2] = sc.nextLine();
        sc.close();

        return datosAlumno;
    }

    @Override
    public void listarAlumnos(String[] datos) {
        String mostrarDatos = """
            ALUMNO
            Nombre: %s
            Apellidos: %s
            Edad: %s
            """.formatted(datos[1], datos[2], datos[3]);
        System.out.println(mostrarDatos);
    }
}
