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

import pojo.Supplier;

/**
 *
 * @author rahulzore
 */
public class SupplierDao extends Dao{
    

    public int addSupplier(Supplier s) {
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
            Supplier supplier = (Supplier) session.get(Supplier.class, id);
            supplier.setProducts(products);
            session.save(supplier);
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
    
    public Supplier getSupplier(String name, String password) {
        Supplier supplier = null;
        try {
            beginTransaction();
            Session session = getSession();
            Query q = session.createQuery("from Supplier where supplierName =:name and password =:password");
            q.setString("name", name);
            q.setString("password", password);
            supplier = (Supplier) q.uniqueResult();
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
        return supplier;
    }
    
    public List<Supplier> getSuppliers() {
        List<Supplier> suppliers = null;
        try {
            beginTransaction();
            Session session = getSession();
            Query q = session.createQuery("from Supplier");
            suppliers = q.list();
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
        return suppliers;
    }
    
    public Supplier getSupplier(String name) {
        Supplier supplier = null;
        try {
            beginTransaction();
            Session session = getSession();
            Query q = session.createQuery("from Supplier where supplierName =:name");
            q.setString("name", name);
            supplier = (Supplier) q.uniqueResult();
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
        return supplier;
    }
}
