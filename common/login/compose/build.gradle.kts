plugins {
    id("multiplatform-setup")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(project(":common:login:presentation"))
            //implementation(project(":common:core-compose"))

            implementation(libs.kviewmodel.core)
            implementation(libs.kviewmodel.compose)
//            implementation(libs.kviewmodel.odyssey)

//            implementation(libs.odyssey.core)
//            implementation(libs.odyssey.compose)
        }

        androidMain.dependencies {
            implementation(libs.coil.core)
            implementation(libs.coil.compose)
        }
    }
}

android {
    namespace = "uptop.dev.ru.login.compose"
}