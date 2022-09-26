package Sprint2;
import java.util.Date;

public class MovimientoDinero {
    public class Transaccion {
        private long Id;
        private String Concepto;
        private float Cantidad;
        //private Date createdAt;
        //private Date updatedAt;

        public long getId() {
            return Id;
        }
        public String getConcepto() {
            return Concepto;
        }
        public float getCantidad() {
            return Cantidad;
        }

    }


}
