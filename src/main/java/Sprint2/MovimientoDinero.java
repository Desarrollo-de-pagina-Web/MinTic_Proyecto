package Sprint2;

public class MovimientoDinero {
    //ESTA CLASE LE PERTENECE A Jhonatan Chavarro Arias, NO LOGRE IMPORTARLA A LA RAMA DEVELOP PORQUE ESTABA EN LA MAIN
    private float Cantidad;
    private Empleado empleado;

    public MovimientoDinero(float cantidad, Empleado empleado) {
        Cantidad = cantidad;
        this.empleado = empleado;
    }

    public float getCantidad() {
        return Cantidad;
    }

    public void setCantidad(float cantidad) {
        Cantidad = cantidad;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

}
