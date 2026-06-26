package pedidos.domain;
import java.util.ArrayList;
import java.util.List;

public class Order {

    //atributos de cada pedidos

    private static int counterId = 0;
    private final int id;
    private OrderStatus estado;
    private List<OrderItem> items;


    // geters y setters
    public int getId() {
        return id;
    }

    public OrderStatus getEstado() {
        return estado;
    }

    public List<OrderItem> getItems() {
        return List.copyOf(this.items);
    }


    // constructores
    public Order ( List<OrderItem> items){
        if (items == null){
            throw new IllegalArgumentException("la lista no puede ser nula");
        }
        if (items.isEmpty()){
            throw new IllegalArgumentException("la lista no puede estar vacia");
        }
        id = counterId;
        counterId++;
        this.estado = OrderStatus.CREATED;
        this.items = new ArrayList<>(items);
    }

    //metodos

    public void addItem(OrderItem item){
        if (item == null){
            throw new IllegalArgumentException("el item no puede ser nulo");
        }
        items.add(item);
    }
    public void procesar(){
        if (this.estado == OrderStatus.CREATED){
            this.estado = OrderStatus.IN_PROGRESS;
        }
        else {
            throw new IllegalArgumentException("solo un pedido creado puede pasar a estar en proceso ");
        }
    }
    public void enviar(){
        if (this.estado == OrderStatus.IN_PROGRESS){
            this.estado = OrderStatus.SHIPPED;
        }
        else {
            throw new IllegalArgumentException("solo un pedido en proceso puede pasar a enviado");
        }
    }
    public void marcarComoPagado(){
        if (this.estado == OrderStatus.SHIPPED){
            this.estado = OrderStatus.PAID;
        }
        else {
            throw new IllegalArgumentException("solo un pedido enviado puede pasar a pagado");
        }
    }
    public double total(){
        double total = 0;
        for (OrderItem item : items) {
        total += item.subtotal();
        }
    return total;
    }
}
