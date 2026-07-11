package pedidos.ports.configuration;

import pedidos.adapters.out.InMemoryOrderRepository;
import pedidos.adapters.out.InMemoryProductRepository;
import pedidos.application.*;

public class ApplicationConfiguration {
    // Repository
    InMemoryOrderRepository orderRepository =
            new InMemoryOrderRepository();

    InMemoryProductRepository productRepository =
            new InMemoryProductRepository();

    public CreateOrderUseCase createOrderUseCase(){
        return new CreateOrderUseCase(orderRepository, productRepository);
    }

    public CreateProductUseCase createProductUseCase(){
        return new CreateProductUseCase(productRepository);
    }

    public FindOrderByIdUseCase findOrderByIdUseCase(){
        return new FindOrderByIdUseCase(orderRepository);
    }

    public FindProductByIdUseCase findProductByIdUseCase(){
        return new FindProductByIdUseCase(productRepository);
    }

    public ListProductsUseCase listProductsUseCase(){
        return new ListProductsUseCase(productRepository);
    }

    public PayOrderUseCase payOrderUseCase(){
        return new PayOrderUseCase(orderRepository);
    }

    public ProcessOrderUseCase processOrderUseCase(){
        return new ProcessOrderUseCase(orderRepository);
    }

    public ShipOrderUseCase shipOrderUseCase(){
        return new ShipOrderUseCase(orderRepository);
    }


}
