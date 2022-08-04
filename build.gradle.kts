import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import util.file
import util.maybeFile

plugins {
    kotlin("jvm") version "1.7.10"
    id("daymxn-plugin")
    id("com.daymxn.kwiki") version "0.9.15"
    `java-library`
}

kWiki {
    wikiTitle.set("kHTML")
    wikiDescription.set("HTML5 DSL written in pure Kotlin!")
    wikiWebsite.set("https://daymxn.github.io")
    wikiWebsiteBase.set("/kHTML")
    wikiSourceDirectory.set(project.file("wiki"))
    outputDirectory.set(project.rootDir.file("docs"))
}

group = "com.daymxn"
version = "0.1.0"

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}
