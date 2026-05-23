package pedidos;

import pedidos.adapters.out.InMemoryOrderRepository;
import pedidos.application.CreateOrderUseCase;
import pedidos.application.GetOrderUseCase;
import pedidos.domain.Order;
import pedidos.domain.OrderItem;
import pedidos.domain.OrderStatus;
import pedidos.domain.Product;

public class Main {

    public static void main(String[] args) {

        // repository
        InMemoryOrderRepository repository =
                new InMemoryOrderRepository();


        // use cases
        CreateOrderUseCase createOrderUseCase =
                new CreateOrderUseCase(repository);

        GetOrderUseCase getOrderUseCase =
                new GetOrderUseCase(repository);


        // productos
        Product laptop = new Product("Laptop", 1500);

        Product mouse = new Product("Mouse", 50);


        // order items
        OrderItem item1 = new OrderItem(laptop, 2);

        OrderItem item2 = new OrderItem(mouse, 3);


        // pedido
        Order order = new Order();

        order.setEstado(OrderStatus.CREATED);

        order.addItem(item1);
        order.addItem(item2);


        // guardar pedido
        createOrderUseCase.createOrder(order);


        // buscar pedido
        Order foundOrder =
                getOrderUseCase.findById(order.getId());


        // mostrar resultado
        System.out.println("ID Pedido: " + foundOrder.getId());

        System.out.println("Estado: " + foundOrder.getEstado());

        System.out.println("Total: " + foundOrder.total());
    }
}