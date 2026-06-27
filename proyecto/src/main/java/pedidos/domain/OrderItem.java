package pedidos.domain;



public class OrderItem {
    private final Product product;
    private final double precioUnitario;
    private final int cantidad;


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

    // constructor
    public OrderItem (Product product, int cantidad ){
        if (product == null){
            throw new IllegalArgumentException("el producto no puede ser nulo");
        }
        if (cantidad>1){
            throw new IllegalArgumentException("no se permiten cantidades menores que 1.");
        }
        this.product = product;
        this.precioUnitario = product.getPrecio();
        this.cantidad = cantidad;

    }

    //metodos

    public double subtotal(){
        return (this.precioUnitario * this.cantidad);
    }
}
