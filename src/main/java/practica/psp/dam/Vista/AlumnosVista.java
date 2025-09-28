package practica.psp.dam.Vista;

import java.util.Scanner;

public class AlumnosVista implements VistaInterfaz{
    
    @Override
    public int opcionMenu() {
        final int OPCION_CREAR_ALUMNO = 1;
        final int OPCION_LISTAR_ALUMNO = 2;
        final int OPCION_SALIR = 3;

        String opciones = """
            %d - Crear alumno.
            %d - Listar alumno.
            %d - Salir.
            """.formatted(OPCION_CREAR_ALUMNO, OPCION_LISTAR_ALUMNO, OPCION_SALIR);

        System.out.println(opciones);

        Scanner sc = new Scanner(System.in);
        int opcion = Integer.parseInt(sc.nextLine());
        sc.close();

        switch (opcion) {
            case OPCION_CREAR_ALUMNO:
                return OPCION_CREAR_ALUMNO;
            case OPCION_LISTAR_ALUMNO:
                return OPCION_LISTAR_ALUMNO;
            case OPCION_SALIR:
                return OPCION_SALIR;
            default:
                return 0;
        }
    }

    @Override
    public String[] crearAlumnos() {
        int atributosAlumno = 3;
        String[] datosAlumno = new String[atributosAlumno];

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
            Edad: %d
            """;
        System.out.println(mostrarDatos);
    }
}
