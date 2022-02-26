plugins {
    id("me.jiayu.thrift.processor.kotlin-application-conventions")
}

dependencies {
    implementation(project(":thrift-processor-common"))
}

application {
    mainClass.set("me.jiayu.thrift.processor.ThriftProcessorKt")
}

dependencies {
    // https://mvnrepository.com/artifact/com.github.ajalt.clikt/clikt
    implementation("com.github.ajalt.clikt:clikt:3.4.0")
}