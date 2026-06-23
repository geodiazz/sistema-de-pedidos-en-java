package pedidos.adapters.out;
import pedidos.domain.Product;
import pedidos.ports.out.ProductRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryProductRepository implements ProductRepository {

    private Map<Integer, Product> products = new HashMap<>();

    public void save(Product product) {
        products.put(product.getIdProducto(), product);
    }

    @Override
    public Product findById(int id) {
       return products.get(id);
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public boolean existsByName(String nombre) {
        for (Product product : products.values()) {
            if (product.getNombre().equals(nombre)) {
                return true;
            }
        }

        return false;
    }
}
