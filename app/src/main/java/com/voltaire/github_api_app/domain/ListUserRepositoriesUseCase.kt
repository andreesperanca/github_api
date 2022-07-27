package com.voltaire.github_api_app.domain

import com.voltaire.github_api_app.core.UseCase
import com.voltaire.github_api_app.data.model.Repo
import com.voltaire.github_api_app.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}