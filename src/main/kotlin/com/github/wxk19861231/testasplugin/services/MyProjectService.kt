package com.github.wxk19861231.testasplugin.services

import com.github.wxk19861231.testasplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
