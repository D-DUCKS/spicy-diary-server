package com.dducks.spicyDiary.history.domin

import javax.persistence.Embeddable

@Embeddable
class HistoryUser(userId: String) {
    private val userId = userId
}