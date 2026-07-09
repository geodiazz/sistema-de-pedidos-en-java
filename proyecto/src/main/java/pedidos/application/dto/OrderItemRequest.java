package pedidos.application.dto;

public class OrderItemRequest {
    private final int idProducto;
    private final int cantidad;

    public OrderItemRequest(int id, int cantidad) {
        if (id <= 0){
            throw new IllegalArgumentException("el id ingresado no puede ser negativo");
        }
        this.idProducto = id;
        if (cantidad <= 0){
            throw new IllegalArgumentException("la cantidad no puede ser negativa");
        }
        this.cantidad = cantidad;
    }
    public int getIdProducto(){
        return this.idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }
}
