plugins {
    kotlin("jvm") version "1.4.30"
    `maven-publish`
}

group = "io.github.openminigameserver"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    api(kotlin("stdlib"))

    api("com.squareup.retrofit2:retrofit:2.9.0")

    implementation("com.squareup.retrofit2:converter-jackson:2.9.0")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.11.4")

    implementation("com.google.guava:guava:30.0-jre")

    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}