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
 */
public class SupplierDirectory {
    private ArrayList<Supplier> spList;
    public SupplierDirectory(){
        spList=new ArrayList();
    }

    public ArrayList<Supplier> getSpList() {
        return spList;
    }
    
    
//    public Supplier createSupplier(String spName){
//        Supplier sp=new Supplier();
//        sp.setSpName(spName);
//       
//        spList.add(sp);
//        return sp;
//        
//    }
    
    public Supplier addSupplier(){
        Supplier sp=new Supplier();
        spList.add(sp);
        return sp;
    }
    public void setSpList(ArrayList<Supplier> spList) {
        this.spList = spList;
    }
    
    public void removeSupplier(Supplier s) {
        spList.remove(s);
    }
}

