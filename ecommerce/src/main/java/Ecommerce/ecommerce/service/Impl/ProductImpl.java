package Ecommerce.ecommerce.service.Impl;

import Ecommerce.ecommerce.Model.Products;
import Ecommerce.ecommerce.exception.ProductException;
import Ecommerce.ecommerce.service.ProductService;

import java.util.List;

public class ProductImpl implements ProductService {
    @Override
    public Products addProducts(Products plant, String key) throws ProductException {
        return null;
    }

    @Override
    public Products updateProduct(Products plant, String key) throws ProductException {
        return null;
    }

    @Override
    public Products deleteProduct(Integer productId, String key) throws ProductException {
        return null;
    }

    @Override
    public Products viewProductsById(Integer productId) throws ProductException {
        return null;
    }

    @Override
    public List<Products> viewProductByName(String ProductName) throws ProductException {
        return null;
    }

    @Override
    public List<Products> viewAllProducts() throws ProductException {
        return null;
    }
}
