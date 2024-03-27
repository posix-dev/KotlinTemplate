plugins {
    id("multiplatform-setup")
    id(libs.plugins.serialization.get().pluginId)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(libs.kotlinx.serialization.core)
        }
    }
}

android {
    namespace = "uptop.dev.ru.login.api"
}