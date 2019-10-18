/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import java.util.ArrayList;

/**
 *
 * @author raoyuhuizi
 */
public class ProductDirectory {
    private ArrayList<Product> proList;
    public ProductDirectory(){
        proList=new ArrayList();
    }

    public ArrayList<Product> getProList() {
        return proList;
    }
    
    public Product addProduct() {
        Product f = new Product();
        proList.add(f);
        return f;
    }
    
    public void addProduct(Product p) {
        proList.add(p);
    }
   
     public void removeProduct(Product p) {
        proList.remove(p);
    }
     
     
    public Product searchProduct(String sss) {
        //ArrayList<Product> result = new ArrayList<Product>();
        for(Product p : proList) {
             if(p.getName().equals(sss)) 
                return p;        
        }
        return null;
    }
     
//    public Product createProduct(String name,Double originPrice,int num,double size ){
//        Product pro=new Product();
//        pro.setName(name);
//        pro.setOriginPrice(originPrice);
//        pro.setNum(num);
//        pro.setSize(size);
//        proList.add(pro);
//        return pro;
//        
//    }
}
