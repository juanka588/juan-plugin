package com.github.juanka588.juanplugin.services

import com.github.juanka588.juanplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
