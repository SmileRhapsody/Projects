/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Manufacture;

import Business.Supplier.Product;
import java.util.Comparator;

/**
 *
 * @author raoyuhuizi
 */
public class SortProList implements Comparator {
         public int compare(Object o1, Object o2) {
          Product s1 = (Product) o1;
          Product s2 = (Product) o2;
         if (s1.getSellPrice() < s2.getSellPrice())
           return 1;
          return -1;
         }
        }
