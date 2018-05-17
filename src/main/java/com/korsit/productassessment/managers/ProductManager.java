/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.korsit.productassessment.managers;

import com.korsit.productassessment.database.DatabasePlaceholder;
import com.korsit.productassessment.domain.Product;
import javax.ejb.Stateless;

/**
 *
 * @author b.vaan
 */
@Stateless
public class ProductManager {
    
    public Product getTestProduct()
    {
        DatabasePlaceholder.initializeDatabasePlaceholder();
        return DatabasePlaceholder.getTestProduct();
    }
    
    public Product addProduct(Product product)
    {
        DatabasePlaceholder.addProduct(product);
        return product;
    }
    
    public void removeProduct(Product product)
    {
        DatabasePlaceholder.removeProduct(product);
    }
    
}
