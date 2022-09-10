package Sprint2;

enum tipo_Rol{
    administrativo,operativo
}



public class Empleado {
private  String nombreEmpleado;
private  String correoEmpleado;
private  tipo_Rol tipo;
private Empresa  emp;

    public Empleado(String nombreEmpleado, String correoEmpleado, tipo_Rol tipo, Empresa emp) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.tipo = tipo;
        this.emp = emp;
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

    public Empresa getEmp() {
        return emp;
    }

    public void setEmp(Empresa emp) {
        this.emp = emp;
    }
}
