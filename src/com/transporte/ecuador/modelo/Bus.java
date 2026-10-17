package com.transporte.ecuador.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "buses")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String disco;

    @Column(nullable = false, unique = true)
    private String placa;

    @Column(nullable = false)
    private String ruta;

    @Column(nullable = false)
    private int capacidad;

    public Bus() {
    }

    public Bus(String disco, String placa, String ruta, int capacidad) {
        this.disco = disco;
        this.placa = placa;
        this.ruta = ruta;
        this.capacidad = capacidad;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDisco() { return disco; }
    public void setDisco(String disco) { this.disco = disco; }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getRuta() { return ruta; }
    public void setRuta(String ruta) { this.ruta = ruta; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    @Override
    public String toString() {
        return "Bus [ID=" + id + ", Disco=" + disco + ", Placa=" + placa + ", Ruta=" + ruta + ", Capacidad=" + capacidad + "]";
    }
}