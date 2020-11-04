package com.dducks.spicyDiary.domian

import java.time.LocalDateTime

data class User {
    var id: String,
    var pwd: String,
    var name: String,
    var nickname: String,
    var phoneNum: String,
    var picture: String,
    var createdAt: LocalDateTime,
    var updatedAt: LocalDateTime
}