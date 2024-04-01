package ktor

import json.serializationModule
import org.kodein.di.DI
import settings.settingsModule

val coreModule = DI.Module("coreModule") {
    importAll(
        serializationModule,
        ktorModule,
        settingsModule
    //        databaseModule,
    )
}

