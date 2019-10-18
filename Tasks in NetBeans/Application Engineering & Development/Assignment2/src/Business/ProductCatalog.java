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
public class ProductCatalog {
    private ArrayList <Product> productList;
    
    public ProductCatalog(){
        productList = new ArrayList();
    }
    
    public Product newProduct(){
        Product p = new Product();
        productList.add(p);
        return p;
    }
    
    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    
}
