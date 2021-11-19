package com.kingOf0.nlayereddemo.core.concrete

import com.kingOf0.nlayereddemo.core.abstract.ILoggerService
import com.other.jlogger.JLoggerManager

class JLoggerManagerAdapter(
    private val manager: JLoggerManager
) : ILoggerService {

    override fun log(string: String) {
        manager.log(string)
    }

}