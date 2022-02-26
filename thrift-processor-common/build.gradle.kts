plugins {
    id("me.jiayu.thrift.processor.kotlin-library-conventions")
}

dependencies {
    // https://jmaven.com/maven/com.microsoft.thrifty/thrifty-schema
    api("com.microsoft.thrifty:thrifty-schema:3.0.0")
}