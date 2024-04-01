plugins {
    id("multiplatform-setup")
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":common:core"))

                implementation(project(":common:login:data"))

            //                implementation(Dependencies.Kodein.core)
            }
        }
    }
}


android {
    namespace = "uptop.dev.ru.bridge.core"
}