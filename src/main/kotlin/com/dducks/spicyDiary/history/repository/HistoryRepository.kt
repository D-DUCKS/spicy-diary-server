package com.dducks.spicyDiary.history.repository

import com.dducks.spicyDiary.history.domin.History
import com.dducks.spicyDiary.history.domin.HistoryNo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
public interface HistoryRepository: JpaRepository<History, HistoryNo> {

}