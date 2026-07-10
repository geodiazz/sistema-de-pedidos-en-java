package pedidos.application;

import pedidos.domain.Order;
import pedidos.ports.out.OrderRepository;

public class PayOrderUseCase {
    private final OrderRepository repository;

    // inyección de dependencia
    public PayOrderUseCase(OrderRepository repository) {
        this.repository = repository;
    }

    public void payOrder(int id){
        if (id <= 0){
            throw new IllegalArgumentException("El id debe de ser mayor que cero.");
        }
        Order order = repository.findById(id);
        if (order == null){
            throw new IllegalArgumentException("la orden seleccionada no existe");
        }
        order.marcarComoPagado();
    }
}
