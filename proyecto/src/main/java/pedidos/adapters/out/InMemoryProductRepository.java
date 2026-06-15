package pedidos.adapters.out;

import pedidos.domain.Product;
import pedidos.ports.out.ProductRepository;

import java.util.Map;

public class InMemoryProductRepository implements ProductRepository {

    private Map<Integer, Product> products;
}
