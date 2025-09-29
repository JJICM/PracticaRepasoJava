package practica.psp.dam.Controlador;

import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import practica.psp.dam.Modelo.Alumnos;
import practica.psp.dam.Modelo.ModeloInterfaz;
import practica.psp.dam.Vista.AlumnosVista;
import practica.psp.dam.Vista.VistaInterfaz;

@ExtendWith(MockitoExtension.class)
public class AlumnosControladorTest {
    
    @InjectMocks
    private AlumnosControlador alumnosControlador;

    @Mock
    private ModeloInterfaz modeloInterfaz;

    @Mock
    private VistaInterfaz vistaInterfaz;

    @Test
    public void crearAlumnosTest() {
        Mockito.when(vistaInterfaz.opcionMenu()).thenReturn(AlumnosVista.OPCION_CREAR_ALUMNO, AlumnosVista.OPCION_SALIR);
        Mockito.when(vistaInterfaz.crearAlumnos()).thenReturn(new String[]{"JJ", "Z", "19"});
        alumnosControlador.start();
        verify(modeloInterfaz).crearAlumnos(argThat(alumno ->
        alumno.getNombre().equals("JJ") &&
        alumno.getApellidos().equals("Z") &&
        alumno.getEdad() == 19));
    }

    @Test
    public void listarAlumnosTest() {
        Mockito.when(vistaInterfaz.opcionMenu()).thenReturn(AlumnosVista.OPCION_LISTAR_ALUMNO, AlumnosVista.OPCION_SALIR);
        Mockito.when(modeloInterfaz.listarAlumnos()).thenReturn(List.of(new Alumnos("JJ", "Z", 19)));
        alumnosControlador.start();
        verify(vistaInterfaz).listarAlumnos(new String[]{"JJ", "Z", "19"});
    }

}
