package com.dducks.spicyDiary.history.domin

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "history_user")
class HistoryUser(userId: String) {
    @Id
    private val userId = userId
}