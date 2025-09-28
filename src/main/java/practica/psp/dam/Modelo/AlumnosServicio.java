package practica.psp.dam.Modelo;

import java.util.ArrayList;
import java.util.List;

public class AlumnosServicio implements ModeloInterfaz{

    private List<Alumnos> alumnos = new ArrayList<>();

    @Override
    public void crearAlumnos(Alumnos alumno) {
        alumnos.add(alumno);
    }

    @Override
    public List<Alumnos> listarAlumnos() {
        return new ArrayList<>(alumnos);
    }

}
