package com.github.vimalancodes.myplug.services

import com.intellij.openapi.project.Project
import com.github.vimalancodes.myplug.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
