package Servicio;

import Entidad.TemperatureConverter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServicioTest {

    Servicio servicio;

    @Before
    public void setUp() throws Exception {
        servicio = new Servicio();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void convertirGradosF() {
        assertEquals(32.0, servicio.convertirGradosF(0.0),0.1);
        assertEquals(211.9, servicio.convertirGradosF(100.0),0.1);
    }

    @Test
    public void convertirGradosK() {
        assertEquals(273.15, servicio.convertirGradosK(0.0),0.1);
        assertEquals(373.15, servicio.convertirGradosK(100.0),0.1);
    }

    @AfterClass
    public static void afterClass() throws Exception {

    }
}