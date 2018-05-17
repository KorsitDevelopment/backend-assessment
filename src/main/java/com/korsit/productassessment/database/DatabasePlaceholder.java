/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.korsit.productassessment.database;

import com.korsit.productassessment.domain.Brand;
import com.korsit.productassessment.domain.Product;
import java.util.ArrayList;

/**
 *
 * @author b.vaan
 */
public class DatabasePlaceholder {
    
    private static ArrayList<Product> products = new ArrayList<>();
    private static ArrayList<Brand> brands = new ArrayList<>();
    
    public static void initializeDatabasePlaceholder()
    {
        Product product = new Product();
        products.add(product);
    }
    
    public static Product getTestProduct()
    {
        if (products.size() > 0)
        {
            return products.get(0);
        }
        
        return null;
    }
    
    /**
     * to-do: implement methods
     */
    public static void addProduct(Product product)
    {
        
    }
    
    /**
     * to-do: implement method
     */
    public static void removeProduct(Product product)
    {
        
    }
    
    
}
