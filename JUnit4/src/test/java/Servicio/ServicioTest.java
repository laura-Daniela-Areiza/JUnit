package Servicio;

import Entidad.TaskManager;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ServicioTest {

    Servicio servicio;

    @org.junit.Before
    public void setUp() throws Exception {
        servicio = new Servicio();

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void addTask() {
        int size = servicio.taskPending().size();
        TaskManager tm= new TaskManager();
        servicio.addTask("Work");
        assertEquals(size + 1, servicio.taskPending().size());
        assertTrue(servicio.taskPending().contains("Work"));

    }

    @org.junit.Test
    public void deleteTask() {
        TaskManager tm= new TaskManager();
        servicio.addTask("Work");
        servicio.addTask("Study");
        servicio.addTask("Read");
        int size = servicio.taskPending().size();
        servicio.deleteTask("Work");
        assertEquals(size - 1, servicio.taskPending().size());
        assertFalse(servicio.taskPending().contains(tm));
    }

    @org.junit.Test
    public void getTasks() {
        TaskManager tm = new TaskManager();
        assertNotNull(tm);
    }
}