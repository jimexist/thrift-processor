/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("me.jiayu.thrift.processor.kotlin-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
}

application {
    // Define the main class for the application.
    mainClass.set("me.jiayu.thrift.processor.app.AppKt")
}