package cz.alenkacz.gradle.marathon.deploy

class CanaryDeployTask extends DeployTaskBase {
    String taskName = "deployCanaryToMarathon"
    public CanaryDeployTask() {
        super({ PluginExtension marathonJsonPath, BigDecimal mesosResourcesRatio -> new CanaryMarathonJsonEnvelope(marathonJsonPath, mesosResourcesRatio) })

        group = 'publishing'
        description = 'Deploys canary of your application to Marathon'
    }
}
