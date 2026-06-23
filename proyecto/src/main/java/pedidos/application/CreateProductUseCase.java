package pedidos.application;

import pedidos.domain.Product;

import pedidos.ports.out.ProductRepository;

public class CreateProductUseCase {
    private final ProductRepository repository;

    public CreateProductUseCase(ProductRepository repository) {
        this.repository = repository;
    }
    public void create(String nombre, double precio){
        if (repository.existsByName(nombre)){
            throw new IllegalArgumentException("Ya existe un producto con ese nombre, intentelo de nuevo");
        }

        Product product = new Product(nombre, precio);
        repository.save(product);

    }
}
