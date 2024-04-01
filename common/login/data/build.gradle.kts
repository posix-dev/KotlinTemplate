plugins {
    id("multiplatform-setup")
    id(libs.plugins.serialization.get().pluginId)
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":common:core"))
                implementation(project(":common:login:api"))

                implementation(libs.kodein.di)
                implementation(libs.multiplatform.settings.core)
            }
        }
    }
}

android {
    namespace ="uptop.dev.ru.login.data"
}