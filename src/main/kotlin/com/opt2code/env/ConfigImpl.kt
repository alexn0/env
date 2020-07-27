/**
 * Copyright (C) 2019-present alexn0
 * All rights reserved.
 */
package com.opt2code.env

class ConfigImpl private constructor(val env: Environment): Config {
    override fun <T: Environment> env() : T = env as T

    companion object {
        fun config(env: Environment): Config = ConfigImpl(env)
    }
}