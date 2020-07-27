/**
 * Copyright (C) 2019-present alexn0
 * All rights reserved.
 */
package com.opt2code.env

interface Config {
    fun <T: Environment> env() : T
}