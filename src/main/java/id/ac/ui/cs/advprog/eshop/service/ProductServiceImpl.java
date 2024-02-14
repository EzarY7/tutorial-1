package id.ac.ui.cs.advprog.eshop.service;

import id.ac.ui.cs.advprog.eshop.model.Product;
import id.ac.ui.cs.advprog.eshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        product.setProductId(String.valueOf(UUID.randomUUID()));
        productRepository.create(product);
        return product;
    }

    @Override public List<Product> findAll() {
        Iterator<Product> productIterator = productRepository.findAll();
        List<Product> allProduct = new ArrayList<>();
        productIterator.forEachRemaining(allProduct::add);
        return allProduct;
    }

    @Override
    public boolean delete(String id) {
        Product product = getId(id);
        return productRepository.delete(product);
    }

    @Override
    public Product getId(String id){
        Iterator<Product> productIterator = productRepository.findAll();
        Product product = null;

        while(productIterator.hasNext()) {
            Product ProductItr = productIterator.next();

            if (Objects.equals(ProductItr.getProductId(), id)){
                product = ProductItr;
            }
        }

        return product;
    }


    @Override
    public Product edit(String currentId, String id, String name, int quantity){
        Product product = getId(currentId);
        product.setProductId(id);
        product.setProductName(name);
        product.setProductQuantity(quantity);
        return product;
    }
}
