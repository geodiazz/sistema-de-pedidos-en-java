package pedidos.application;

import pedidos.domain.Product;
import pedidos.ports.out.ProductRepository;

public class GetProductUseCase {
    private final ProductRepository repository;

    public GetProductUseCase(ProductRepository repository) {
        this.repository = repository;
    }
    public Product getById(int id){
        if (repository.findById(id) == null){
            throw new IllegalArgumentException("el producto buscado no existe");
        }
        return repository.findById(id);
    }
}
