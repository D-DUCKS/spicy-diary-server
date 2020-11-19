package com.dducks.spicyDiary.history.domin

import java.io.Serializable
import javax.persistence.Embeddable

@Embeddable
class HistoryNo(): Serializable{
    private var historyNo: Long = 0
}