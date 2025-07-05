plugins {
    kotlin("jvm") version "2.1.20"
}

val versionMajor = 1
val versionMinor = 0
val versionSecure = 0
val versionBuild = 1

group = "com.bargystvelp.ai-math"
version = "$versionMajor.$versionMinor.$versionSecure.$versionBuild"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}