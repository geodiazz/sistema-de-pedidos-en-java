package pedidos.application;

import pedidos.domain.Order;
import pedidos.ports.out.OrderRepository;

public class ShipOrderUseCase {
    private final OrderRepository repository;

    // inyección de dependencia
    public ShipOrderUseCase(OrderRepository repository) {
        this.repository = repository;
    }

    public void ShipOrder(int id){
        if (id <= 0){
            throw new IllegalArgumentException("El id debe de ser mayor que cero.");
        }
        Order order = repository.findById(id);
        if (order == null){
            throw new IllegalArgumentException("la orden seleccionada no existe");
        }
        order.enviar();
    }
}
