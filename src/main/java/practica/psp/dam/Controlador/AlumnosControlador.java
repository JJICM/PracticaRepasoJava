package practica.psp.dam.Controlador;

import practica.psp.dam.Modelo.Alumnos;
import practica.psp.dam.Modelo.AlumnosServicio;
import practica.psp.dam.Vista.AlumnosVista;

public class AlumnosControlador {
    private AlumnosServicio alumnosServicio;
    private AlumnosVista alumnosVista;

    public AlumnosControlador(AlumnosServicio alumnosServicio, AlumnosVista alumnosVista) {
        this.alumnosServicio = alumnosServicio;
        this.alumnosVista = alumnosVista;
    }

    public void start() {
        boolean salir = false;
        while (!salir) {
            switch (alumnosVista.opcionMenu()) {
                case AlumnosVista.OPCION_CREAR_ALUMNO:
                    String[] datos = alumnosVista.crearAlumnos();
                    alumnosServicio.crearAlumnos(new Alumnos(datos[0], datos[1], Integer.parseInt(datos[2])));
                    break;
                case AlumnosVista.OPCION_LISTAR_ALUMNO:
                    for (Alumnos alumno : alumnosServicio.listarAlumnos()) {
                        String[] datosAlumno = new String[]{alumno.getNombre(), alumno.getApellidos(), Integer.toString(alumno.getEdad())};
                        alumnosVista.listarAlumnos(datosAlumno);
                    }
                    break;
                case AlumnosVista.OPCION_SALIR:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
        }
        }
    }
    
}
