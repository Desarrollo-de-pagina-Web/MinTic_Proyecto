package Sprint2;

public class Main {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("Mazda","Cl. 87 # 35-87","3128254856","F332626");
        Empresa empresa2 = new Empresa("Nissan","Cra. 133 # 23-12","3138254823","G42624");

        Empleado empleado1 = new Empleado("Juan","juan@gmai.com",tipo_Rol.operativo,empresa1);
        Empleado empleado2 = new Empleado("Pedro","Pedro@gmai.com",tipo_Rol.administrativo,empresa2);

        MovimientoDinero movimientoDinero1 = new MovimientoDinero(1500000,empleado1);
        MovimientoDinero movimientoDinero2 = new MovimientoDinero(3500000,empleado2);

        System.out.println("Telefono de la empresa 1: "+empresa1.getTelefono());
        System.out.println("direccion de la empresa 2: "+empresa2.getDireccion());
        System.out.println("Rol del empleado 1: "+empleado1.getTipo());
        System.out.println("Empresa a la que pertenece el empleado 2: "+empleado2.getEmp().getNombre());
        System.out.println("Movimiento de dinero 1 a: "+movimientoDinero1.getEmpleado().getNombreEmpleado());
        System.out.println("cantidad de movimiento de dinero 2: "+movimientoDinero2.getCantidad());
    }
}
