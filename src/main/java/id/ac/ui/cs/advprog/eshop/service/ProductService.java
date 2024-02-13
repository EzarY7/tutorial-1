package id.ac.ui.cs.advprog.eshop.service;

import id.ac.ui.cs.advprog.eshop.model.Product;
import java.util.List;

public interface ProductService {
    Product create(Product product);
    List<Product> findAll();
    boolean delete(String id);
    Product getId(String id);
    Product edit(String CurrentId, String Id, String Name, int Quantity);
}
