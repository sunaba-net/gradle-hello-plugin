plugins {
    kotlin("jvm") version "1.3.61"
    id("java-gradle-plugin")
    `kotlin-dsl`
    `maven-publish`
}

group = "net.sunaba.plugin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}

configure<GradlePluginDevelopmentExtension> {
    plugins {
        register("Gradle Hello Plugin") {
            id = "gradle-hello-plugin"
            implementationClass = "net.sunaba.plugin.HelloPlugin"
        }
    }
}