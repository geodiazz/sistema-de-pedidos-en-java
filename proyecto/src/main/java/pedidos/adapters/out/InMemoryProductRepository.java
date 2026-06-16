package pedidos.adapters.out;
import pedidos.domain.Product;
import pedidos.ports.out.ProductRepository;

import java.util.List;
import java.util.Map;

public class InMemoryProductRepository implements ProductRepository {

    private Map<Integer, Product> products;

    public void save(Product product) {

       //tengo una duda con la siguiente linea de codigo, la forma de asignar el integer es correcta?
        products.put(product.getIdProducto(), product);
    }

    @Override
    public Product findById(int id) {
        if (products.containsKey(id)){
            return products.get(id);
        }
       return null;
    }
    //el mismo ide me sugirio la siguiente funcion tal cual esta, la verdad no conozco la forma de hacerlo por mi cuenta
    @Override
    public List<Product> findAll() {
        return List.of();
    }
}
