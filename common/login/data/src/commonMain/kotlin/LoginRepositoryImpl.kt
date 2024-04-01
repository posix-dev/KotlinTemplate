import ktor.KtorLoginRemoteDataSource
import ktor.KtorLoginRequest
import models.Token
import settings.SettingsAuthDataSource

class LoginRepositoryImpl(
    private val remoteDataSource: KtorLoginRemoteDataSource,
    private val cacheDataSource: SettingsAuthDataSource
) : LoginRepository {

    override suspend fun login(login: String, password: String): Token {
        val token = remoteDataSource.performLogin(
            request = KtorLoginRequest(
                login = login,
                password = password
            )
        )

        cacheDataSource.saveToken(token.token)
        return token
    }

    override fun isUserLoggedIn(): Boolean {
        return cacheDataSource.fetchToken().isNotBlank()
    }
}