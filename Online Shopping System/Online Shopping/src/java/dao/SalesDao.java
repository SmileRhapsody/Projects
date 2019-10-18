/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import pojo.Sales;
import pojo.Supplier;

/**
 *
 * @author Administrator
 */
public class SalesDao extends Dao{
    
    public int addSales(Sales s) {
        int result = 0;
        try {
            beginTransaction();
            Session session = getSession();
            session.save(s);
            commit();
            result = 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            try {
                rollbackTransaction();
            } catch (Exception ex) {
                Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
//                close();
            } catch (Exception ex) {
                Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }
    
    public int updateProducts(int id, Set products) {
        int result = 0;
        try {
            beginTransaction();
            Session session = getSession();
            Sales sales = (Sales) session.get(Sales.class, id);
            sales.setSalesProducts(products);
            session.save(sales);
            commit();
            result = 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            try {
                rollbackTransaction();
            } catch (Exception ex) {
                Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
//                close();
            } catch (Exception ex) {
                Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }
    
    public List<Sales> getSales() {
        List<Sales> salesList = null;
        try {
            beginTransaction();
            Session session = getSession();
            Query q = session.createQuery("from Sales");
            salesList = q.list();
            commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            try {
                rollbackTransaction();
            } catch (Exception ex) {
                Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                //close();
            } catch (Exception ex) {
                Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return salesList;
    }
    
    public Sales getSales(String name, String password) {
        Sales sales = null;
        try {
            beginTransaction();
            Session session = getSession();
            Query q = session.createQuery("from Sales where name =:name and password =:password");
            q.setString("name", name);
            q.setString("password", password);
            sales = (Sales) q.uniqueResult();
            commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            try {
                rollbackTransaction();
            } catch (Exception ex) {
                Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                //close();
            } catch (Exception ex) {
                Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return sales;
    }
    
    public Sales getSales(String name) {
        Sales sales = null;
        try {
            beginTransaction();
            Session session = getSession();
            Query q = session.createQuery("from Sales where name =:name");
            q.setString("name", name);
            sales = (Sales) q.uniqueResult();
            commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            try {
                rollbackTransaction();
            } catch (Exception ex) {
                Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                //close();
            } catch (Exception ex) {
                Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return sales;
    }
}
