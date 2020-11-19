package com.dducks.spicyDiary.history.domin

import javax.persistence.Embeddable
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "history_user")
@Embeddable
class HistoryUser(userId: String) {
    @Id
    private val userId = userId
}