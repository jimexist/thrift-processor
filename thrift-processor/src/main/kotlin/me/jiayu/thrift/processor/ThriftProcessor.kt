package me.jiayu.thrift.processor

import com.github.ajalt.clikt.core.CliktCommand


class ThriftProcessor : CliktCommand(help = "Thrift Processor") {
    override fun run() {

    }
}

fun main(args: Array<String>) = ThriftProcessor().main(args)
