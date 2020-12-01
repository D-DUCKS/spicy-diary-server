package com.dducks.spicyDiary.history.service

import com.dducks.spicyDiary.history.domin.History
import com.dducks.spicyDiary.history.domin.HistorySubway
import com.dducks.spicyDiary.history.repository.HistoryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class HistoryService {
    @Autowired
    private lateinit var historyRepository: HistoryRepository

    fun getHistoryList(subway: HistorySubway): List<History> {
        return historyRepository.findBySubway(subway)
    }

    fun getDetailHistory(historyNo: Long?): History {
        if (historyNo == null) {
            throw RuntimeException("Search historyNo is null")
        }

        return historyRepository.findById(historyNo).get()
    }

    fun registerHistory(history: History): History {
        val historyNo = history.getHistoryNo() ?: return historyRepository.save(history)

        val existHistory: Optional<History> = historyRepository.findById(historyNo)
        if (existHistory.isPresent) {
            throw RuntimeException("Already Exist History")
        }

        return historyRepository.save(history)
    }

    fun modifyHistory(newHistory: History) {
        val history = getDetailHistory(newHistory.getHistoryNo()!!)

        history.setStoreName(newHistory.getStoreName())
        history.setContent(newHistory.getContent())
        history.setPhoto(newHistory.getPhoto())
        history.setRating(newHistory.getRating())
        history.setDate()
//        history.setFriends(newHistory.getFriends())

        historyRepository.save(history)
    }

    fun deleteHistory(historyNo: Long?) {
        if (historyNo == null) {
            throw RuntimeException("Search historyNo is null")
        }

        historyRepository.deleteById(historyNo)
    }
}