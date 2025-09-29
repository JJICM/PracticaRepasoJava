package practica.psp.dam.Controlador;

import practica.psp.dam.Modelo.Alumnos;
import practica.psp.dam.Modelo.ModeloInterfaz;
import practica.psp.dam.Vista.AlumnosVista;
import practica.psp.dam.Vista.VistaInterfaz;

public class AlumnosControlador {
    private ModeloInterfaz modeloInterfaz;
    private VistaInterfaz vistaInterfaz;

    public AlumnosControlador(ModeloInterfaz modeloInterfaz, VistaInterfaz vistaInterfaz) {
        this.modeloInterfaz = modeloInterfaz;
        this.vistaInterfaz = vistaInterfaz;
    }

    public void start() {
        boolean salir = false;
        while (!salir) {
            switch (vistaInterfaz.opcionMenu()) {
                case AlumnosVista.OPCION_CREAR_ALUMNO:
                    modeloInterfaz.crearAlumnos(vistaInterfaz.crearAlumnos());
                    break;
                case AlumnosVista.OPCION_LISTAR_ALUMNO:
                    for (Alumnos alumno : modeloInterfaz.listarAlumnos()) {
                        vistaInterfaz.listarAlumnos(alumno);
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
