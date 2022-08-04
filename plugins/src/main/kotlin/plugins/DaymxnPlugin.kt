package plugins

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.jetbrains.dokka.DokkaConfiguration
import org.jetbrains.dokka.gradle.DokkaMultiModuleTask
import org.jetbrains.dokka.gradle.DokkaTask

abstract class DaymxnPlugin: Plugin<Project> {
    override fun apply(project: Project) {
        project.pluginManager.apply("org.jetbrains.dokka")
        project.tasks.withType(DokkaTask::class.java).configureEach {
            it.dokkaSourceSets.configureEach {
                it.documentedVisibilities.set(
                        setOf(DokkaConfiguration.Visibility.PUBLIC)
                )
                it.skipEmptyPackages.set(true)
                it.includes.setFrom(project.rootProject.file("module.md"))
            }
        }
    }
}
