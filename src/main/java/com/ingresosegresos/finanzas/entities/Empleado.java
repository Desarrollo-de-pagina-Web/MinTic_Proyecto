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
    @Column(name="numerodocumento")
    private String numeroDocumento;
    @Column(name="email")
    private  String correoEmpleado;
    @Enumerated(EnumType.ORDINAL)
    @Column(name="rol")
    private  tipo_Rol tipo;
    @Column(name="password",length = 200)
    private String password;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="miembroempresa")
    private Empresa emp;
    @OneToOne
    @JoinColumn(name = "tipodocumentoid")
    private Tipodocumento tipodocumento;


public Empleado(){

}


    public Empleado(String nombreEmpleado, String correoEmpleado, Empresa emp,int id,String password,String numeroDocumento) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.id=id;
        this.password=password;
        this.numeroDocumento=numeroDocumento;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Tipodocumento getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(Tipodocumento tipodocumento) {
        this.tipodocumento = tipodocumento;
    }
}





