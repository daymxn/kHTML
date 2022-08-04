import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import util.file
import util.maybeFile

plugins {
    kotlin("jvm") version "1.7.10"
    id("daymxn-plugin")
    id("com.daymxn.kwiki") version "0.9.15"
    id("maven-publish")
    `java-library`
}

kWiki {
    wikiTitle.set("kHTML")
    wikiDescription.set("HTML5 DSL written in pure Kotlin!")
    wikiWebsite.set("https://khtml.daymxn.com")
    wikiSourceDirectory.set(project.file("wiki"))
    outputDirectory.set(project.rootDir.file("docs"))
}

group = "com.daymxn"
version = "1.0.0"

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/daymxn/kHTML")
            credentials {
                username = project.findProperty("gpr.user")?.toString() ?: System.getenv("USERNAME")
                password = project.findProperty("gpr.key")?.toString() ?: System.getenv("TOKEN")
            }
        }
    }
    publications {
        register<MavenPublication>("kHTML") {
            from(components["java"])
            pom {
                url.set("https://maven.pkg.github.com/daymxn/kHTML")
            }
        }
    }
}
