package pedidos.domain;

public class Product {

    private static int idContador = 1;
    private final int idProducto;
    private String nombre;
    private double precio;

    //getters y setters
    public int getIdProducto() {
        return idProducto;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }

    //constructor

    public Product(String nombre, double precio){
        if (nombre == null){
            throw new IllegalArgumentException("el nombre del producto no puede ser nulo");
        }
        if (nombre.isBlank()) {
            throw new IllegalArgumentException("el nombre del producto no puede estar vacio");
        }
        if (nombre.length()>50){
            throw new IllegalArgumentException("el nombre no puede tener mas de 50 caracteres");
        }
        if (precio<=0.0){
            throw new IllegalArgumentException("el precio del producto no puede ser menor que cero");
        }
        idProducto = idContador;
        idContador++;
        this.nombre = nombre;
        this.precio = precio;
    }

}
