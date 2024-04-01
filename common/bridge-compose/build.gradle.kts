plugins {
    id("multiplatform-setup")
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":common:core"))
                //implementation(project(":common:core-compose"))
                implementation(project(":common:login:data"))
                implementation(project(":common:login:compose"))

                implementation(libs.kviewmodel.core)
                implementation(libs.kviewmodel.compose)
                //implementation(libs.kviewmodel.odyssey)

                //implementation(libs.odyssey.core)
                //implementation(libs.odyssey.compose)
            }
        }

        androidMain {
            dependencies {
                //implementation(project(":common:core-compose"))
                implementation(libs.androidx.activity.compose)
            }
        }
    }
}

android {
    namespace = "uptop.dev.ru.bridge.compose"
}