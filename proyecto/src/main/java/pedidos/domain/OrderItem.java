package pedidos.domain;
public class OrderItem {
    private Product product;
    private double precioUnitario;
    private int cantidad;


    //getters y setters


    public Product getProduct() {
        return product;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad<1){
            throw new IllegalArgumentException("la cantidad no puede ser menor que 1");
        }
        //!!!
        this.cantidad = cantidad + this.cantidad;
    }

    // constructor
    public OrderItem (Product product, int cantidad ){
        if (cantidad>1){
            throw new IllegalArgumentException("no se permiten cantidades menores que 1.");
        }
        this.product = product;
        this.precioUnitario = product.getPrecio();
        setCantidad(cantidad);

    }

    //metodos

    public double subtotal(){
        return (this.precioUnitario * this.cantidad);
    }
}
