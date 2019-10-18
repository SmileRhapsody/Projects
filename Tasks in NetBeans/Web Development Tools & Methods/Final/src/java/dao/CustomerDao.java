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
import pojo.Customer;

/**
 *
 * @author Administrator
 */
public class CustomerDao extends Dao{
    
    public int addCustomer(Customer c) {
        int result = 0;
        try {
            beginTransaction();
            Session session = getSession();
            session.save(c);
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
    
    public int updateOrders(int id, Set orders) {
        int result = 0;
        try {
            beginTransaction();
            Session session = getSession();
            Customer customer = (Customer) session.get(Customer.class, id);
            customer.setOrders(orders);
            session.save(customer);
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
    
    public List<Customer> getCustomers() {
        List<Customer> customers = null;
        try {
            beginTransaction();
            Session session = getSession();
            Query q = session.createQuery("from Customer");
            customers = q.list();
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
        return customers;
    }
    
    
    public Customer getCustomer(String name, String password) {
        Customer customer = null;
        try {
            beginTransaction();
            Session session = getSession();
            Query q = session.createQuery("from Customer where name =:name and password =:password");
            q.setString("name", name);
            q.setString("password", password);
            customer = (Customer) q.uniqueResult();
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
        return customer;
    }
    
    public Customer getCustomer(String name) {
        Customer customer = null;
        try {
            beginTransaction();
            Session session = getSession();
            Query q = session.createQuery("from Customer where name =:name");
            q.setString("name", name);
            customer = (Customer) q.uniqueResult();
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
        return customer;
    }
}
