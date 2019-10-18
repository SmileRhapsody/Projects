/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import java.util.ArrayList;

;

/**
 *
 * @author raoyuhuizi
 * This List shows that sell price of all products in this country.
 * It is different from the supplier's origin price, and every country
 * can set different price to one same product.
 * 
 * The sell price should be stored in the variable sellPrice (in Product)
 */
public class CtyProductDirectory {
    private ArrayList<Product> proList;
    public CtyProductDirectory(){
        proList=new ArrayList();
    }

    public ArrayList<Product> getProList() {
        return proList;
    }
    public Product createProduct(String name,Double sellPrice,Double originPrice,int num,double size ){
        Product pro=new Product();
        pro.setName(name);
        pro.setOriginPrice(originPrice);
        //This is the most important info in this class
        pro.setSellPrice(sellPrice);
        pro.setNum(num);
        pro.setSize(size);
        proList.add(pro);
        return pro;
        
    }
    
}
