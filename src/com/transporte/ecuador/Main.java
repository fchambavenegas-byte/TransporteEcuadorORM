package com.transporte.ecuador;

import com.transporte.ecuador.dao.BusDAO;
import com.transporte.ecuador.modelo.Bus;

public class Main {
    public static void main(String[] args) {
        BusDAO busDAO = new BusDAO();

        // Creamos un bus de prueba
        Bus nuevoBus = new Bus("12", "PABC-123", "Quito - Sangolquí", 42);

        // Lo guardamos en la base de datos
        busDAO.guardarBus(nuevoBus);

        // Imprimimos la lista de buses registrados
        System.out.println("\n--- LISTA DE BUSES REGISTRADOS ---");
        for (Bus b : busDAO.listarBuses()) {
            System.out.println(b);
        }
    }
}
