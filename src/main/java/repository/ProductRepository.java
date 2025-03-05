package repository;


import entity.Product;
import exceptions.ProductNotFoundException;

public interface ProductRepository {
    void addProduct(Product product);
    Product getProductById(int id) throws ProductNotFoundException;
    Product[] getAllProducts();


}
