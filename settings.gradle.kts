pluginManagement {
    val maybeUsername = ""
    val maybePassword = ""

    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/daymxn/kwiki")
            credentials {
                username = maybeUsername.takeIf { it.isNotBlank() } ?: System.getenv("USERNAME")
                password = maybePassword.takeIf { it.isNotBlank() } ?: System.getenv("TOKEN")
            }
        }
    }
    includeBuild("plugins")
}

dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "khtml"
