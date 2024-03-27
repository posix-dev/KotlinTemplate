plugins {
    id(libs.plugins.kotlinMultiplatform.get().pluginId).apply(false)
    id(libs.plugins.androidApplication.get().pluginId).apply(false)
    id(libs.plugins.jetbrainsCompose.get().pluginId).apply(false)
    id(libs.plugins.androidLibrary.get().pluginId).apply(false)
}