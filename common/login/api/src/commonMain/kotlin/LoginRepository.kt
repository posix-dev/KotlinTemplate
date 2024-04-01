import models.Token

interface LoginRepository {
    suspend fun login(login: String, password: String): Token
    fun isUserLoggedIn(): Boolean
}