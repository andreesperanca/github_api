package com.voltaire.github_api_app.data.repositories

import com.voltaire.github_api_app.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}