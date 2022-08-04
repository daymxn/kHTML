plugins {
    `java-library`
    `java-gradle-plugin`
    kotlin("jvm") version "1.7.10"
}

group = "com.daymxn"
version = "0.1.0"

gradlePlugin {
    plugins {
        register("daymxn-plugin") {
            id = "daymxn-plugin"
            implementationClass = "plugins.DaymxnPlugin"
        }
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("gradle-plugin", "1.7.10"))
    implementation("org.jetbrains.dokka:dokka-gradle-plugin:1.7.10")
    implementation("org.jetbrains.dokka:dokka-base:1.7.10")
}
