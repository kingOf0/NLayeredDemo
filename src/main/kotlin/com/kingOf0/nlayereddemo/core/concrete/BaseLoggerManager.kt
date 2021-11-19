package com.kingOf0.nlayereddemo.core.concrete

import com.kingOf0.nlayereddemo.core.abstract.ILoggerService

class BaseLoggerManager() : ILoggerService {

    override fun log(string: String) {
        println(string)
    }

}