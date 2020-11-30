package com.dducks.spicyDiary.history.domin

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "history_user")
class HistoryUser(nickName: String) {
    @Id
    private lateinit var userId: String
    private var nickName = nickName
}
