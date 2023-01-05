package Ecommerce.ecommerce.service;

import Ecommerce.ecommerce.Model.Products;
import Ecommerce.ecommerce.exception.ProductException;

import java.util.List;

public interface ProductService {

    public Products addProducts(Products plant, String key) throws ProductException;
    public Products updateProduct(Products plant,String key)throws ProductException;
    public Products deleteProduct(Integer productId,String key)throws ProductException;
    public Products viewProductsById(Integer productId)throws ProductException;
    public List<Products> viewProductByName(String ProductName)throws ProductException;
    public List<Products> viewAllProducts()throws ProductException;
}
