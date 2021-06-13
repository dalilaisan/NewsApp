package com.example.dalila.newsapp.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.dalila.newsapp.Article


@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsertArticle(article: Article): Long

    @Query("SELECT * FROM article")
    fun getAllArticles(): LiveData<List<Article>>

    @Delete
    fun deleteArticle(article: Article)
}