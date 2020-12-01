package com.dducks.spicyDiary.history.service

import com.dducks.spicyDiary.history.domin.History
import com.dducks.spicyDiary.history.domin.HistorySubway
import junit.framework.Assert.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDateTime

@SpringBootTest
@AutoConfigureMockMvc
class HistoryServiceTest @Autowired constructor(
        val historyService: HistoryService
) {

    private val subway = HistorySubway("test_subway_id")
    private val storeName = "testStore"
    private val content = "JPA가 너무 어려워요ㅠㅠ.."
    private val photo = ""
    private val rating = 1.0F
    private val date = LocalDateTime.now()
    private val registrant = "seonhee"

    @Test
    @Transactional
    fun getHistoryList___정상동작일_경우___historyList_반환() {
        val firstStoreName = "firstStore"
        val firstHistory = History(subway, firstStoreName, content, photo, rating, date, registrant)

        val secondStoreName = "secondStore"
        val secondHistory = History(subway, secondStoreName, content, photo, rating, date, registrant)

        historyService.registerHistory(firstHistory)
        historyService.registerHistory(secondHistory)

        val historyList = historyService.getHistoryList(subway)

        assertEquals(2, historyList.size)

        assertEquals(firstStoreName, historyList[0].getStoreName())
        assertEquals(secondStoreName, historyList[1].getStoreName())
    }

    @Test
    @Transactional
    fun getDetailHistory___정상동작일_경우___history_반환() {
        val registerHistory = historyService.registerHistory(History(subway, storeName, content, photo, rating, date, registrant))

        val searchHistory = historyService.getDetailHistory(registerHistory.getHistoryNo())

        assertSame(registerHistory, searchHistory)
    }

    @Test
    @Transactional
    fun getDetailHistory___존재하지_않는_historyNo일_경우___Exception_발생() {
        assertThrows<RuntimeException> {
            historyService.getDetailHistory(null)
        }
    }

    @Test
    @Transactional
    fun registerHistory_정상동작일_경우___history_저장() {
        val history = History(subway, storeName, content, photo, rating, date, registrant)
        val result = historyService.registerHistory(history)

        assertEquals(storeName, result.getStoreName())
        assertEquals(content, result.getContent())
        assertEquals(photo, result.getPhoto())
        assertEquals(rating, result.getRating())
    }

    @Test
    @Transactional
    fun registerHistory___이미_존재하는_history일_경우___Exception_발생() {
        val existHistory = historyService.getDetailHistory(2L)
        existHistory.setContent("이미 존재하는 history 등록")

        assertThrows<RuntimeException> {
            historyService.registerHistory(existHistory)
        }
    }

    @Test
    @Transactional
    fun modifyHistory___정상동작일_경우___수정된_history_저장() {
        val oldHistory = historyService.registerHistory(History(subway, storeName, content, photo, rating, date, registrant))

        val newContent = "수정된 History 입니다!!!"
        val newHistory = historyService.getDetailHistory(oldHistory.getHistoryNo())
        newHistory.setContent(newContent)

        historyService.modifyHistory(newHistory)

        val result = historyService.getDetailHistory(oldHistory.getHistoryNo())

        assertEquals(newContent, result.getContent())
    }

    @Test
    @Transactional
    fun deleteHistory___정상동작일_경우___history_삭제() {
        val registerHistory = historyService.registerHistory(History(subway, storeName, content, photo, rating, date, registrant))

        assertNotNull(historyService.getDetailHistory(registerHistory.getHistoryNo()))

        historyService.deleteHistory(registerHistory.getHistoryNo())

        assertThrows<NoSuchElementException> { historyService.getDetailHistory(registerHistory.getHistoryNo()) }
    }

}