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
    }

    group = "cn.com.riversoft"
    version = "0.9.7-SNAPSHOT"


    idea {
        module {
            inheritOutputDirs = false
            isDownloadJavadoc = false
            isDownloadSources = true
            outputDir = java.sourceSets["main"].java.outputDir
            testOutputDir = java.sourceSets["test"].java.outputDir
        }
    }
}

subprojects {

    repositories {
        mavenLocal()

        maven("http://repo.maven.apache.org/maven2")
    }

}
