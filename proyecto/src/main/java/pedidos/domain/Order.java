package pedidos.domain;


import java.util.ArrayList;
import java.util.List;

public class Order {

    //atributos de cada pedidos


    private int id;
    private String estado;
    private List<OrderItem> items;


    // geters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<OrderItem> getItems() {
        return items;
    }


    // constructores
    public Order(){
        this.items = new ArrayList<>();
    }
    public Order (int id, String estado, List<OrderItem> items){
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
