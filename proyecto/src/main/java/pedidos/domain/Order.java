package pedidos.domain;
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
        return items;
    }


    // constructores
    public Order ( List<OrderItem> items){
        if (items.isEmpty()){
            throw new IllegalArgumentException("la lista no puede estar vacia");
        }
        id = counterId;
        counterId++;
        this.estado = OrderStatus.CREATED;
        this.items = items;
    }

    //metodos

    public void addItem(OrderItem item){
        items.add(item);
    }
    public void enProceso(){
        if (this.estado == OrderStatus.CREATED){
            this.estado = OrderStatus.IN_PROGRESS;
        }
        else {
            throw new IllegalArgumentException("no se puede asignar el estado del pedido a un estado anterior");
        }
    }
    public void enviado(){
        if (this.estado == OrderStatus.IN_PROGRESS){
            this.estado = OrderStatus.SHIPPED;
        }
        else {
            throw new IllegalArgumentException("no se puede asignar el estado del pedido a un estado anterior");
        }
    }
    public void  pagado(){
        if (this.estado == OrderStatus.SHIPPED){
            this.estado = OrderStatus.PAID;
        }
        else {
            throw new IllegalArgumentException("no se puede asignar el estado del pedido a un estado anterior");
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
