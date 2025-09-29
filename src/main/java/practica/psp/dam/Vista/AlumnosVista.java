package practica.psp.dam.Vista;

import java.util.Scanner;

public class AlumnosVista implements VistaInterfaz{
    
    public static final int OPCION_CREAR_ALUMNO = 1;
    public static final int OPCION_LISTAR_ALUMNO = 2;
    public static final int OPCION_SALIR = 3;

    private static final int ATRIBUTOS_ALUMNO = 3;

    private Scanner sc;

    @Override
    public int opcionMenu() {
        String opciones = """
            %d - Crear alumno.
            %d - Listar alumno.
            %d - Salir.
            """.formatted(OPCION_CREAR_ALUMNO, OPCION_LISTAR_ALUMNO, OPCION_SALIR);

        System.out.println(opciones);    //Manejar el rango a 1-3 con while

        sc = new Scanner(System.in);
        int opcion = Integer.parseInt(sc.nextLine());   //Excepción NumberFormatException

        return opcion;
    }

    @Override
    public String[] crearAlumnos() {    //Cambiar a Alumno crearAlumnos() para que retorne un objeto alumno directamente
        String[] datosAlumno = new String[ATRIBUTOS_ALUMNO];

        sc = new Scanner(System.in);
        System.out.println("Nombre del alumno: ");
        datosAlumno[0] = sc.nextLine();     //Mantenimiento del proyecto, variables
        System.out.println("Apellidos del alumno: ");
        datosAlumno[1] = sc.nextLine();
        System.out.println("Edad del alumno: ");    //Manejar la edad, debe ser un entero positivo
        datosAlumno[2] = sc.nextLine();

        return datosAlumno;
    }

    @Override
    public void listarAlumnos(String[] datos) {     //Cambiar a void listarAlumnos(Alumnos alumno) para usar los getters de Alumno
        String mostrarDatos = """
            ALUMNO
            Nombre: %s
            Apellidos: %s
            Edad: %s
            """.formatted(datos[0], datos[1], datos[2]);    //Mantenimiento del proyecto, variables
        System.out.println(mostrarDatos);
    }
}
