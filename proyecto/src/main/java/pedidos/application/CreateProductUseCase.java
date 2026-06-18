package pedidos.application;

import pedidos.domain.Product;

import pedidos.ports.out.ProductRepository;

public class CreateProductUseCase {
    private final ProductRepository repository;

    public CreateProductUseCase(ProductRepository repository) {
        this.repository = repository;
    }
    public void create(String nombre, double precio){
        if (nombre == null){
            throw new IllegalArgumentException("el producto no puede ser nulo");
        } else if (nombre.isBlank()) {
            throw new IllegalArgumentException("el nombre no puede estar vacio");
        }
        if (precio<=0.0){
            throw new IllegalArgumentException("el precio del producto no puede ser menor que cero");
        }
        Product product = new Product(nombre, precio);
        repository.save(product);
    }
}
