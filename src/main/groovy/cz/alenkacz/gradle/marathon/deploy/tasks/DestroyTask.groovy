package cz.alenkacz.gradle.marathon.deploy

import org.gradle.api.DefaultTask
import cz.alenkacz.gradle.marathon.deploy.tasks.NamedTask
import org.gradle.api.tasks.TaskAction

class DestroyTask extends NamedTask  {

    @TaskAction
    def deployToMarathon() {
    }

    String getTaskName() {
        return "destroyApp"
    }
}

