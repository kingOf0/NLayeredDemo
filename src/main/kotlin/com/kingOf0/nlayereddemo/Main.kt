package com.kingOf0.nlayereddemo

import com.kingOf0.nlayereddemo.core.concrete.JLoggerManagerAdapter
import com.kingOf0.nlayereddemo.business.concrete.ProductManager
import com.kingOf0.nlayereddemo.dataaccess.concrete.HibernateProductDAO
import com.kingOf0.nlayereddemo.entity.concrete.Product
import com.other.jlogger.JLoggerManager

fun main() {
    val logger = JLoggerManagerAdapter(JLoggerManager())
    val productManager = ProductManager(HibernateProductDAO(), logger)

    productManager.add(Product(1, 42, "The meaning of life", 42.0, 0))

}