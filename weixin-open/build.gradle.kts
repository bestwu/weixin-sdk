description = "weixin sdk open"
dependencies {
    compile(project(":weixin-common"))
    compile("org.apache.httpcomponents:fluent-hc:4.5")
    compile("org.apache.httpcomponents:httpmime:4.5")
    compile("com.google.guava:guava:18.0")
    compile("com.fasterxml.jackson.core:jackson-databind:2.9.0")
    compile("com.fasterxml.jackson.core:jackson-annotations:2.9.0")
    compile("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.9.0")
    compile("com.fasterxml.woodstox:woodstox-core:5.0.3")
    compile("commons-io:commons-io:2.4")
    compile("org.slf4j:slf4j-api:1.7.12")
    testCompile("com.fasterxml.jackson.dataformat:jackson-dataformat-csv:2.9.0")
    testCompile("junit:junit:4.12")
    testCompile("org.slf4j:slf4j-simple:1.7.12")
}
