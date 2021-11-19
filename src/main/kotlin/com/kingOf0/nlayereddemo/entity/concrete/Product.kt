package com.kingOf0.nlayereddemo.entity.concrete

import com.kingOf0.nlayereddemo.entity.abstract.Entity

data class Product (
    val id: Int,
    val categoryId: Int,
    val name: String,
    val price: Double,
    val stock: Int
) : Entity