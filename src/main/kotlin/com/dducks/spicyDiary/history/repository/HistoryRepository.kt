package com.dducks.spicyDiary.history.repository

import com.dducks.spicyDiary.history.domin.History
import com.dducks.spicyDiary.history.domin.HistoryNo
import com.dducks.spicyDiary.history.domin.HistorySubway
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface HistoryRepository : JpaRepository<History, HistoryNo> {
    fun findBySubway(subway: HistorySubway): List<History>
}