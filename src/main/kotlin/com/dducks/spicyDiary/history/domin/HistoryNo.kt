package com.dducks.spicyDiary.history.domin

import java.io.Serializable
import javax.persistence.Embeddable

@Embeddable
class HistoryNo(historyNo: Long): Serializable{
    private var historyNo = historyNo
}