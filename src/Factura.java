public class Factura {
    private String numPieza;
    private String descripcionPieza;
    private int cantidadProducto;
    private double precio;


    public Factura(String numPieza, String descripcionPieza, int cantidadProducto, double precio) {
        this.numPieza = numPieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidadProducto = cantidadProducto;
        this.precio = precio;
    }

    public String getNumPieza() {
        return numPieza;
    }

    public void setNumPieza(String numPieza) {
        this.numPieza = numPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void establecerDescricion(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;

    }

    //Establecer Cantidad
    public void establecerCantidad() {
        if (cantidadProducto > 0) {
            this.cantidadProducto = cantidadProducto;
        } else {
            this.cantidadProducto = 0;
        }
    }


    //Establecer Precio
    public void estrablecerPrecio(double precio) {
        if (precio > 0.0) {
            this.precio = precio;
        } else {
            this.precio = 0.0;
        }
    }


    //Obtener Numero pieza
    public String obtenerNumPieza() {

        return numPieza;
    }

    //Obtener Descripcion
    public String obtenerDescripcion() {

        return descripcionPieza;
    }

    //Obtener Cantidad
    public int obtenerCantidad() {

        return cantidadProducto;
    }

    //Obtener Precio
    public double obtenerPrecio() {

        return precio;
    }


    //Obtener Monto
    public double obtenerMontofactura() {

        return cantidadProducto * precio;
    }

}

