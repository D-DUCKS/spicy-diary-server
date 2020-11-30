package com.dducks.spicyDiary.history.service

import com.dducks.spicyDiary.history.domin.History
import com.dducks.spicyDiary.history.domin.HistoryNo
import com.dducks.spicyDiary.history.domin.HistorySubway
import com.dducks.spicyDiary.history.repository.HistoryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class HistoryService() {
    @Autowired
    private lateinit var historyRepository: HistoryRepository

    fun getHistorys(subway: HistorySubway): List<History> {
        return historyRepository.findBySubway(subway)
    }

    fun getDetailHistory(historyNo: HistoryNo): History {
        return historyRepository.findById(historyNo).orElseThrow()
    }

    fun registerHistory(history: History) {
        val existHistory: Optional<History> = historyRepository.findById(history.getHistoryNo())

        if (existHistory.isPresent) {
            throw RuntimeException("Already Exist History")
        }

        historyRepository.save(history)
    }

    fun modifyHistory(newHistory: History) {
        val history = getDetailHistory(newHistory.getHistoryNo())

        history.setStoreName(newHistory.getStoreName())
        history.setContent(newHistory.getContent())
        history.setPhoto(newHistory.getPhoto())
        history.setRating(newHistory.getRating())
        history.setDate()
        history.setFriends(newHistory.getFriends())

        historyRepository.save(history)
    }

    fun deleteHistory(historyNo: HistoryNo) {
        historyRepository.deleteById(historyNo)
    }
}