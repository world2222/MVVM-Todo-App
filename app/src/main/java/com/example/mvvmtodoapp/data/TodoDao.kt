package com.example.mvvmtodoapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface TodoDao {

    @Upsert
    suspend fun insertTodo(todo: Todo)   // Using 'suspend' to wait until current function actually get the result.

    @Delete
    suspend fun deleteTodo(todo: Todo)

    @Query("SELECT * FROM todo WHERE id = :id")     // Putting colon(:) to refer to the parameter(id: Int).
    suspend fun getTodoById(id: Int): Todo?

    @Query("SELECT * FROM todo")
    fun getTodos(): Flow<List<Todo>>    // Using 'flow' to update the database as soon as any changes happen with the database.
}