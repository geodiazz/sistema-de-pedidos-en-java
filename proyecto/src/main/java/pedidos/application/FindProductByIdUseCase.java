package pedidos.application;

import pedidos.domain.Product;
import pedidos.ports.out.ProductRepository;

public class FindProductByIdUseCase {
    private final ProductRepository repository;

    public FindProductByIdUseCase(ProductRepository repository) {
        this.repository = repository;
    }
    public Product getById(int id){
        Product product = repository.findById(id);
        if (id <= 0){
            throw new IllegalArgumentException("El id ingresado no puede ser menor que cero.");
        }
        if (product == null){
            throw new IllegalArgumentException("El producto buscado no existe.");
        }
        return product;
    }
}
