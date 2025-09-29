package practica.psp.dam.Vista;

import practica.psp.dam.Modelo.Alumnos;

public interface VistaInterfaz {
    int opcionMenu();
    Alumnos crearAlumnos();
    void listarAlumnos(String[] datos);
}
