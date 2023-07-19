package com.example.mvvmtodoapp.data

import kotlinx.coroutines.flow.Flow

class TodoRepositoryImpl(
    private val dao: TodoDao
): TodoRepository {
    override suspend fun insertTodo(todo: Todo) {
        dao.insertTodo(todo)
    }

    override suspend fun deleteTodo(todo: Todo) {
        dao.deleteTodo(todo)
    }

    override suspend fun getTodoById(id: Int): Todo? {
        return dao.getTodoById(id)      // return attached cuz "getTodoById(id: int): Todo?" has its return value
    }

    override fun getTodos(): Flow<List<Todo>> {
        return dao.getTodos()
    }
}