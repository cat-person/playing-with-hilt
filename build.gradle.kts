// Top-level build file
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Android Gradle Plugin
        classpath("com.android.tools.build:gradle:8.11.1")

        // Kotlin Gradle Plugin
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:2.2.0")

        // Dagger Hilt
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.57")
    }
}

// Apply KSP plugin to all subprojects
plugins {
    id("com.google.devtools.ksp") version "2.2.0-2.0.2" apply false
}