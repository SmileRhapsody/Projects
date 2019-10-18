/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class ProductDirectory {
    private ArrayList<Product> productlist;
    
    public ProductDirectory(){
        this.productlist = new ArrayList<>();
    }
    
    public ArrayList<Product> getProductlist() {
        return productlist;
    }

    public void setProductlist(ArrayList<Product> productlist) {
        this.productlist = productlist;
    }
    
    public Product addProduct(){
        Product product = new Product();
        productlist.add(product);
        return product;
    }
    
    public void deleteProduct(Product product){
        productlist.remove(product);
    }
    
    public Product searchProduct(String productID){
        for (Product product: productlist){
            if(product.getProductID().equals(productID)){
                return product;
            }
        }
        return null;
    }
}
