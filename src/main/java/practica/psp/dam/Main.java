package practica.psp.dam;

import practica.psp.dam.Controlador.AlumnosControlador;
import practica.psp.dam.Modelo.AlumnosServicio;
import practica.psp.dam.Vista.AlumnosVista;

public class Main {
    public static void main(String[] args) {
        AlumnosControlador alumnosControlador = new AlumnosControlador(new AlumnosServicio(), new AlumnosVista());

        alumnosControlador.start();
    }
}