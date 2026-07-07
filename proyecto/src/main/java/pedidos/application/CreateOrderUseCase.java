package pedidos.application;

import pedidos.domain.Order;
import pedidos.domain.OrderItem;
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
    public void createOrder(List<OrderItemRecuest> items) {
        List<OrderItem> orderItems = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            if (productRepository.findById(i) == null){
                throw new IllegalArgumentException("El producto buscado no existe.");
                return;
            }
            orderItems.add(new OrderItem(productRepository.findById(i),));
        }

        orderRepository.save(new Order(orderItems));

    }


}
