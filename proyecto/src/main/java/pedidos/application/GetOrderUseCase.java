package pedidos.application;
import pedidos.domain.Order;
import pedidos.ports.out.OrderRepository;

public class GetOrderUseCase {

    private OrderRepository repository;

    // inyección de dependencia
    public GetOrderUseCase(OrderRepository repository) {
        this.repository = repository;
    }

    public Order findById(int id) {
        if (id < 0){
            throw new IllegalArgumentException("el id no puede ser negativo");
        }

        return repository.findOrderById(id);
    }

}
