package net.sunaba.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.internal.AbstractTask
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.register

open class HelloTask:AbstractTask() {
    init {
        group = "greeting"
    }

    @TaskAction
    fun hello() {
        println("Hello")
    }
}

class HelloPlugin: Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.register("hello", HelloTask::class)
    }
}