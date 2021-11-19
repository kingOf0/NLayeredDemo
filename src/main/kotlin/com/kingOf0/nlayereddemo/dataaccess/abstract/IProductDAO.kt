package com.kingOf0.nlayereddemo.dataaccess.abstract

import com.kingOf0.nlayereddemo.entity.concrete.Product

interface IProductDAO {

    fun add(product: Product)

    fun update(product: Product)

    fun delete(product: Product)

    fun get(id: Int) : Product
    fun find(name: String) : List<Product>

}