package pedidos.domain;

public class Product {

    private static int idContador = 1;
    private int idProducto;
    private String nombreProducto;
    private double precioProducto;

    //getters y setters




    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    //constructores

    public Product (){
        // el id se asigna automaticamente y se autoincrementa, gracias a la variable idcontador
        idProducto = idContador;
        idContador++;
    }

    public Product(String nombreProducto, double precioProducto){
        idProducto = idContador;
        idContador++;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }

}
