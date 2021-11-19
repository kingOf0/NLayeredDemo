package com.kingOf0.nlayereddemo.business.abstract

import com.kingOf0.nlayereddemo.entity.concrete.Product

interface ProductService {

    fun add(product: Product)

    fun update(product: Product)

    fun delete(product: Product)


}