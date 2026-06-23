package pedidos.ports.out;

import pedidos.domain.Product;

import java.util.List;
import java.util.Map;

public interface ProductRepository {
    void save(Product product);
    Product findById(int id);
    List<Product> findAll();
    boolean existsByName(String nombre);
}
