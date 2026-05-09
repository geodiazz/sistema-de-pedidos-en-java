package pedidos.domain;


import java.util.ArrayList;
import java.util.List;

public class Order {

    //atributos de cada pedidos


    private int id;
    private OrderStatus estado;
    private List<OrderItem> items;


    // geters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public Order (int id, OrderStatus estado, List<OrderItem> items){
        this.id = id;
        this.estado = estado;
        this.items = items;
    }

    //metodos
    public double total(){
        double totalOrder = 0;
    return totalOrder;
    }
}
