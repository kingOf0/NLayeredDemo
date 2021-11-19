package com.kingOf0.nlayereddemo.business.concrete

import com.kingOf0.nlayereddemo.business.abstract.ProductService
import com.kingOf0.nlayereddemo.dataaccess.abstract.IProductDAO
import com.kingOf0.nlayereddemo.entity.concrete.Product

class ProductManager(
    private val productDAO: IProductDAO,
    private val logger: ILoggerService
) : ProductService {

    override fun add(product: Product) {
        if (product.categoryId == 42) {
            logger.log("You cannot add the meaning of life.")
            return
        }
        productDAO.add(product)
    }

    override fun update(product: Product) {
        if (product.categoryId == 42) {
            logger.log("You cannot add the meaning of life.")
            return
        }
        productDAO.update(product)
    }

    override fun delete(product: Product) {
        if (product.categoryId == 42) {
            logger.log("You cannot delete the meaning of life.")
            return
        }
        productDAO.delete(product)
    }

}