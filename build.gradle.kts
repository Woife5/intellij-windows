plugins {
    id("org.jetbrains.intellij.platform")
}

group = "com.github.woife5"
version = providers.gradleProperty("pluginVersion").get()

dependencies {
    intellijPlatform {
        intellijIdeaCommunity(providers.gradleProperty("platformVersion").get())
    }
}

intellijPlatform {
    pluginConfiguration {
        id = "com.github.woife5.intellij-windows-themes"
        name = providers.gradleProperty("pluginName").get()
        version = providers.gradleProperty("pluginVersion").get()
        changeNotes = providers.fileContents(layout.projectDirectory.file("CHANGELOG.html")).asText
        ideaVersion {
            sinceBuild = providers.gradleProperty("pluginSinceBuild").get()
        }
        vendor {
            name = "Wolfgang"
        }
    }
    publishing {
        token = providers.environmentVariable("PUBLISH_TOKEN").orElse("")
    }
    buildSearchableOptions = false
}
