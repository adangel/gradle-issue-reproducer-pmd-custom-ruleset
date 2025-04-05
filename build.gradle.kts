

plugins {
    id("application")
    id("pmd")
}

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

application {
    mainClass = "org.example.App"
}

pmd {
    toolVersion = "7.12.0"
    isConsoleOutput = true
}

tasks {
    pmdMain {
        ruleSetConfig = resources.text.fromFile("${project.projectDir}/my-custom-ruleset.xml")
    }
}
