plugins {
    id("multiplatform-setup")
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                api(project(":common:login:api"))
                api(project(":common:core"))

                implementation(libs.kviewmodel.core)
            }
        }
    }
}

android {
    namespace = "uptop.dev.ru.login.presentation"
}