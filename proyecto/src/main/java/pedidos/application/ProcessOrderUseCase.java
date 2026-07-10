package pedidos.application;

import pedidos.domain.Order;
import pedidos.ports.out.OrderRepository;

public class ProcessOrderUseCase {

    private final OrderRepository repository;

    // inyección de dependencia
    public ProcessOrderUseCase(OrderRepository repository) {
        this.repository = repository;
    }

    public void processOrder(int id){
        if (id <= 0){
            throw new IllegalArgumentException("El id debe de ser mayor que cero.");
        }
        Order order = repository.findById(id);
        if (order == null){
            throw new IllegalArgumentException("la orden seleccionada no existe");
        }
        order.procesar();
    }
}
