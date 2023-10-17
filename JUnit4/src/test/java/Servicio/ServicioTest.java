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
        TaskManager tm = new TaskManager();
        int size = tm.getTask().size();
        String task = "";
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add(task);
        assertEquals(size + 1, tm.getTask().size());
    }

    @org.junit.Test
    public void deleteTask() {
        TaskManager tm = new TaskManager();
        int size = tm.getTask().size();
        String task = "";
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add(task);;
        assertEquals(size - 1, tm.getTask().size());
    }

    @org.junit.Test
    public void getTasks() {
        TaskManager tm = new TaskManager();
        assertNotNull(tm.getTask());
    }
}