plugins {
    java
    idea
    id("cn.bestwu.publish") version "0.0.24"
    id("com.jfrog.artifactory") version "4.7.5"
}

allprojects {
    apply {
        plugin("java")
        plugin("idea")
        plugin("cn.bestwu.publish")
        plugin("com.jfrog.artifactory")
    }

    group = "cn.bestwu"
    version = "0.9.7-SNAPSHOT"


    idea {
        module {
            inheritOutputDirs = false
            isDownloadJavadoc = false
            isDownloadSources = true
            outputDir = the<SourceSetContainer>()["main"].java.outputDir
            testOutputDir = the<SourceSetContainer>()["test"].java.outputDir
        }
    }

}

subprojects {

    repositories {
        mavenLocal()
        maven("http://repo.maven.apache.org/maven2")
    }

}
