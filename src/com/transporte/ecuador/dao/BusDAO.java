package com.transporte.ecuador.dao;

import com.transporte.ecuador.modelo.Bus;
import com.transporte.ecuador.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BusDAO {

    // Método para guardar un bus en la base de datos
    public void guardarBus(Bus bus) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(bus);
            transaction.commit();
            System.out.println("¡Bus guardado exitosamente en la base de datos!");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // Método para listar todos los buses registrados
    public List<Bus> listarBuses() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Bus", Bus.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}