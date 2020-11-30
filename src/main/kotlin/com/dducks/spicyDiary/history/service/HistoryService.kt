package com.dducks.spicyDiary.history.service

import com.dducks.spicyDiary.history.domin.History
import com.dducks.spicyDiary.history.repository.HistoryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class HistoryService() {
    @Autowired
    private lateinit var historyRepository: HistoryRepository

    fun getHistory(historyId: Long): History {
        return historyRepository.findById(historyId)
    }

}