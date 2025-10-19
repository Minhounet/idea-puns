plugins {
    kotlin("jvm") version "1.9.0"
}

group = "com.minhounet.ideapuns.application"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(project(":core"))
    implementation(project(":infra"))
    // Add application-specific dependencies here
}