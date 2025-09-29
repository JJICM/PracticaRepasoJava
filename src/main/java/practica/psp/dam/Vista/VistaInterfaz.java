package practica.psp.dam.Vista;

import java.util.List;

import practica.psp.dam.Modelo.Alumnos;

public interface VistaInterfaz {
    int opcionMenu();
    Alumnos crearAlumnos();
    void listarAlumnos(List<Alumnos> alumnos);
}
