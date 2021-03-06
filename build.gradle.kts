plugins {
    java
    idea
    id("cn.bestwu.publish") version "0.0.30"
    id("com.jfrog.artifactory") version "4.8.1"
}

allprojects {
    apply {
        plugin("java")
        plugin("idea")
        plugin("cn.bestwu.publish")
        plugin("com.jfrog.artifactory")
    }

    group = "cn.bestwu.wechat"
    version = "0.9.8-SNAPSHOT"


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
