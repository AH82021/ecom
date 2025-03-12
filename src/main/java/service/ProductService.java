package service;

import entity.Product;
import repository.ProductRepository;

public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void  addProduct(Product product){
        productRepository.addProduct(product);
    }


    public Product getProductById(int id){
        return productRepository.getProductById(id);
    }

    public Product[] getAllProducts(){
        return productRepository.getAllProducts();
    }






}
