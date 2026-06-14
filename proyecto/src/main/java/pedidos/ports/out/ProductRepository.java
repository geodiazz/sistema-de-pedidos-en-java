package pedidos.ports.out;

import pedidos.domain.Product;

import java.util.ArrayList;
import java.util.List;

public interface ProductRepository {
    void save(Product product);
    Product findProductById(int id);
     List<Product> findAll();
}
