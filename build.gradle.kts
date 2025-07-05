plugins {
    kotlin("jvm") version "2.1.20"
}

group = "com.bargystvelp.ai-math"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}