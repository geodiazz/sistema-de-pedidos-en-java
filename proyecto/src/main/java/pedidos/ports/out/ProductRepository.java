package pedidos.ports.out;

import pedidos.domain.Product;

import java.util.ArrayList;

public interface ProductRepository {
    void saveProduct(Product product);
    Product findProductById(int id);
    ArrayList findAll();
}
