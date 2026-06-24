package pedidos.application;

import pedidos.domain.Product;
import pedidos.ports.out.ProductRepository;
import java.util.List;

public class ListProductsUseCase {
    private final ProductRepository repository;

    public ListProductsUseCase(ProductRepository repository) {
        this.repository = repository;
    }
    public List<Product> getAll(){
        return repository.findAll();
    }
}
