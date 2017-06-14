package cz.alenkacz.gradle.marathon.deploy.tasks

import org.gradle.api.DefaultTask

abstract class NamedTask extends DefaultTask {
    abstract public String getTaskName();
}
