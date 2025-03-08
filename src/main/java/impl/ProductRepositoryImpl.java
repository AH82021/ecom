package impl;

import entity.Product;
import exceptions.ProductNotFoundException;
import repository.ProductRepository;



public class ProductRepositoryImpl implements ProductRepository {
      private static   final int MAX_PRODUCTS = 100;
      Product[] products =new Product[MAX_PRODUCTS];
      private int productCount = 0;
    @Override
    public void addProduct(Product product) {
        if(productCount<MAX_PRODUCTS){
            products[productCount] = product;
          productCount++;
            System.out.println("Product "+product.getName()+" added successfully");
        } else{
            throw new ArrayIndexOutOfBoundsException("Product storage is full "+MAX_PRODUCTS);
        }

    }

    @Override
    public Product getProductById(int id) throws ProductNotFoundException {

        for(int i=0;i<productCount;i++){
            if (products[i].getId()==id) {
                return products[i];
            }
        }
      throw new ProductNotFoundException("Product not found with id "+id);
    }

    @Override
    public Product[] getAllProducts() {
        Product[] existingProducts = new Product[productCount];
//        for(int i=0;i<productCount;i++){
//            existingProducts[i] = products[i];
//        }
        System.arraycopy(products,0,existingProducts,0,productCount);


        return products;
    }
}
