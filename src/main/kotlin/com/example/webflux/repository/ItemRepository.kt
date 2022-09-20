package com.example.webflux.repository

import com.example.webflux.domain.Item
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ItemRepository : CoroutineCrudRepository<Item, Long> {

    fun findByName(name: String): Item

    suspend fun <T> findByName(name: String, type: Class<T>): T?
}