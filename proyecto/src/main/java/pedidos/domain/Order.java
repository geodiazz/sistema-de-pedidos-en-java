package pedidos.domain;


import java.util.ArrayList;
import java.util.List;

public class Order {

    //atributos de cada pedidos

    private static int counterId = 0;
    private int id;
    private OrderStatus estado;
    private List<OrderItem> items;


    // geters y setters
    public int getId() {
        return id;
    }

    public OrderStatus getEstado() {
        return estado;
    }

    public void setEstado(OrderStatus estado) {
        this.estado = estado;
    }

    public List<OrderItem> getItems() {
        return items;
    }


    // constructores
    public Order(){
        this.items = new ArrayList<>();
    }
    public Order ( OrderStatus estado, List<OrderItem> items){

        id = counterId;
        counterId++;
        if (estado == null || items == null){
            throw new IllegalArgumentException("no se permiten valores nulos");
        }
        this.estado = estado;
        this.items = items;
    }

    //metodos

    public void addItem(OrderItem item){
        if (item == null){
            throw new IllegalArgumentException("no se aceptan items invalidos");
        }
        items.add(item);
    }
    public double total(){
        double total = 0;
        for (OrderItem item : items) {
        total += item.subtotal();
        }
    return total;
    }
}
