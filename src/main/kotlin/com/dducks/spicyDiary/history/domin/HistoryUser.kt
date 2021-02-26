package com.dducks.spicyDiary.history.domin

import javax.persistence.*

@Embeddable
@Access(AccessType.FIELD)
class HistoryUser(userId: String, nickName: String, photo: String) {
    private var userId = userId
    private var nickName = nickName

    @Column(name = "profilePhoto")
    private var photo = photo

    fun getUserId(): String {
        return this.userId
    }

    fun getNickName(): String {
        return this.nickName
    }

    fun getPhoto(): String {
        return this.photo
    }
}
