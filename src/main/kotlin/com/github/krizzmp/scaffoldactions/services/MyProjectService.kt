package com.github.krizzmp.scaffoldactions.services

import com.github.krizzmp.scaffoldactions.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
