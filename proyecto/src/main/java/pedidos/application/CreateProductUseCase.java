package pedidos.application;

import pedidos.domain.Product;

import pedidos.ports.out.ProductRepository;

public class CreateProductUseCase {
    private final ProductRepository repository;

    public CreateProductUseCase(ProductRepository repository) {
        this.repository = repository;
    }
    public void create(String nombre, double precio){
        Product product = new Product(nombre, precio);
        repository.save(product);
    }
}
