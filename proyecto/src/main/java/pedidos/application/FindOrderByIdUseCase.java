package pedidos.application;
import pedidos.domain.Order;
import pedidos.ports.out.OrderRepository;

public class FindOrderByIdUseCase {

    private final OrderRepository repository;

    // inyección de dependencia
    public FindOrderByIdUseCase(OrderRepository repository) {
        this.repository = repository;
    }

        public Order getById(int id){
            Order order = repository.findById(id);
            if (id <= 0){
                throw new IllegalArgumentException("El id ingresado no puede ser menor que cero.");
            }
            if (order == null){
                throw new IllegalArgumentException("La orden buscada no existe.");
            }
            return order;
        }
    }


