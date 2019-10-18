/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

;

/**
 *
 * @author raoyuhuizi
 */
public class Supplier {
    private String spName;
//    private int id;
//    private static int count=1;
    private ProductDirectory proList;
    
    public Supplier(){
//        id=count;
//        count++;
        proList=new ProductDirectory();
    }

    public ProductDirectory getProList() {
        return proList;
    }

    public void setProList(ProductDirectory proList) {
        this.proList = proList;
    }

//    public int getId() {
//        return id;
//    }

    public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

//    public static int getCount() {
//        return count;
//    }
//
//    public static void setCount(int count) {
//        Supplier.count = count;
//    }
    @Override
    public String toString(){
        return spName;
    }
}
