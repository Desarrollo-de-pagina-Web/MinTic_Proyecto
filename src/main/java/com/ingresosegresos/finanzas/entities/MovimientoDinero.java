package com.ingresosegresos.finanzas.entities;

import javax.persistence.*;

@Entity
@Table(name = "movDinero")


    public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long Id;
    @Column(name = "concepto")
        private String Concepto;
    @Column(name = "cantidad")
        private float Cantidad;


        public MovimientoDinero(long id, String concepto, float cantidad) {
            setId(id);
            setConcepto(concepto);
            setCantidad(cantidad);
        }


        public long getId() {
            return Id;
        }

        public void setId(long id) {
            Id = id;
        }

        public String getConcepto() {
            return Concepto;
        }

        public void setConcepto(String concepto) {
            Concepto = concepto;
        }

        public float getCantidad() {
            return Cantidad;
        }

        public void setCantidad(float cantidad) {
            Cantidad = cantidad;
        }
    }



