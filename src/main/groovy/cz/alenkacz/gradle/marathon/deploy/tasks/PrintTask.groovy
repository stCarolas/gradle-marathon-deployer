package cz.alenkacz.gradle.marathon.deploy

import org.gradle.api.DefaultTask
import cz.alenkacz.gradle.marathon.deploy.tasks.NamedTask
import org.gradle.api.tasks.TaskAction

class PrintTask extends NamedTask {
    PluginExtension pluginExtension

    @TaskAction
    def print() {
        def marathonJsonEnvelope = new MarathonJsonEnvelope(pluginExtension, new ResourcesRatioFetcher(pluginExtension.getMarathonApiUrl()).getMesosResourcesRatio())
        println(marathonJsonEnvelope.getFinalJson(new NoOpLogger()))
    }
}
