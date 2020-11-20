package com.dducks.spicyDiary.history.domin

import javax.persistence.Embeddable
import javax.persistence.Id

@Embeddable
class HistoryUser(userId: String) {
    @Id
    private val userId = userId
}