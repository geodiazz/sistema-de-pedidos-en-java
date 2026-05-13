package pedidos.domain;

public class Product {

    private static int idContador = 1;
    private int idProducto;
    private String nombre;
    private double precio;

    //getters y setters




    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null){
            throw new IllegalArgumentException("no se permiten nombres nulos en el producto");
        }
        if (nombre.isBlank()){
        throw new IllegalArgumentException("el nombre del producto no puede estar vacio");
        }
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {

        if (precio <1){
       throw new IllegalArgumentException("el precio del producto no puede ser menor que 1");
        }
        this.precio = precio;
    }

    //constructor


    public Product(String nombreProducto, double precioProducto){
        idProducto = idContador;
        idContador++;
        setNombre(nombreProducto);
        setPrecio(precioProducto);
    }

}
