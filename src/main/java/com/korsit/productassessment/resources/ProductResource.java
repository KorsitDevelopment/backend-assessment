/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.korsit.productassessment.resources;

import com.google.gson.Gson;
import com.korsit.productassessment.domain.Product;
import com.korsit.productassessment.managers.ProductManager;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author b.vaan
 */
@Stateless
@Path("/product")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class ProductResource {
    
    @Inject
    private ProductManager productManager;
    
    
    @GET
    @Path("/createTestProduct")
    public String createTestProduct()
    {
        Product product = productManager.getTestProduct();
        return new Gson().toJson(product);
      
    }
    
    @POST
    @Path("/createProduct")
    public String createProduct(String productJson)
    {
        Product product = new Gson().fromJson(productJson, Product.class);
        product = productManager.addProduct(product);
        return new Gson().toJson(product);
    }
    
}
