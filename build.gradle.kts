plugins {
    id("java")
    // 1. Apply the JaCoCo plugin
    id("jacoco")
    id("checkstyle")
}

group = "org.example"
version = "1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
    // 2. Ensure tests finalize with the report generation
    finalizedBy(tasks.jacocoTestReport)
}

// 3. Configure the report task
tasks.jacocoTestReport {
    dependsOn(tasks.test) // Ensure tests run before generating the report

    reports {
        xml.required.set(true)
        html.required.set(true)
    }
}

checkstyle {
    toolVersion = "10.12.5"
    // Fails the build if there are style errors
    isIgnoreFailures = false
    // Uses Google's style guide (built-in)
    configFile = file("${rootProject.projectDir}/config/checkstyle/checkstyle.xml")
}