import ktor.KtorLoginRemoteDataSource
import org.kodein.di.*
import settings.SettingsAuthDataSource

val loginModule = DI.Module("loginModule") {
    bind<LoginRepository>() with singleton {
        LoginRepositoryImpl(instance(), instance())
    }

    bind<SettingsAuthDataSource>() with provider {
        SettingsAuthDataSource(instance())
    }

    bind<KtorLoginRemoteDataSource>() with provider {
        KtorLoginRemoteDataSource(instance())
    }
}