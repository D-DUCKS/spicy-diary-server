package com.dducks.spicyDiary.history.domin

import javax.persistence.Embeddable
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class HistoryUser(userId: String) {
    @Id
    private val userId = userId
}