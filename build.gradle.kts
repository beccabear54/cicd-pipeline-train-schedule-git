/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * To learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.2.1/samples
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
  id("com.moowork.node") version "1.3.1"
}

tasks.register("hello") {
    doLast {
        println("Hello world!")
    }
}

tasks.register("anotherTask") {
    dependsOn("hello")
    doLast {
        val someString = "mY_nAmE"
        println("Original: $someString")
        println("Upper case: ${someString.toUpperCase()}")
    }
}