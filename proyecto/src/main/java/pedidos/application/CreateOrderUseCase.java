package pedidos.application;

import pedidos.application.dto.OrderItemRequest;
import pedidos.domain.Order;
import pedidos.domain.OrderItem;
import pedidos.domain.Product;
import pedidos.ports.out.OrderRepository;
import pedidos.ports.out.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class CreateOrderUseCase {
    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;

    // inyección de dependencia
    public CreateOrderUseCase(OrderRepository orderRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }
    public void createOrder(List<OrderItemRequest> items) {
        List<OrderItem> orderItems = new ArrayList<>();
        for (OrderItemRequest itemRequest : items){
            Product product = productRepository.findById(itemRequest.getIdProducto());
            if (product == null){
                throw new IllegalArgumentException("no existe ningun producto con el id ingresado");
            }
            orderItems.add(new OrderItem(product,itemRequest.getCantidad()));
        }
        orderRepository.save(new Order(orderItems));

    }


}
