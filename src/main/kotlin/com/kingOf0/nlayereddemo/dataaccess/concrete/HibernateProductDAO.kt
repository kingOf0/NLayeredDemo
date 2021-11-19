package com.kingOf0.nlayereddemo.dataaccess.concrete

import com.kingOf0.nlayereddemo.dataaccess.abstract.IProductDAO
import com.kingOf0.nlayereddemo.entity.concrete.Product

class HibernateProductDAO : IProductDAO {

    override fun add(product: Product) {
        print("Product added $product")
    }

    override fun update(product: Product) {
        print("Product updated $product")
    }

    override fun delete(product: Product) {
        print("Product deleted $product")
    }

    override fun get(id: Int): Product {
        TODO("Not yet implemented")
    }

    override fun find(name: String): List<Product> {
        TODO("Not yet implemented")
    }


}