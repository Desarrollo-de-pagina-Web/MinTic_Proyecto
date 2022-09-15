package com.ingresosegresos.finanzas.entities;

import javax.persistence.*;

@Entity
@Table(name="empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nombres")
    private  String nombreEmpleado;
    @Column(name="email")
    private  String correoEmpleado;
    @Enumerated(EnumType.STRING)
    @Column(name="rol")
    private  tipo_Rol tipo;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="miembroempresa")
    private Empresa emp;

public Empleado(){

}


    public Empleado(String nombreEmpleado, String correoEmpleado, Empresa emp,int id) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.id=id;

    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }




    public tipo_Rol getTipo() {
        return tipo;
    }

    public void setTipo(tipo_Rol tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Empresa getEmp() {
        return emp;
    }

    public void setEmp(Empresa emp) {
        this.emp = emp;
    }
}





