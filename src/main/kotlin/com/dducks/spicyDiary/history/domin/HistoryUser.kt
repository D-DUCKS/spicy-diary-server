package com.dducks.spicyDiary.history.domin

import javax.persistence.*

@Embeddable
class HistoryUser(userId: String, nickName: String, photo: String) {
    private var userId = userId
    private var nickName = nickName
    @Column(name="profilePhoto")
    private var photo = photo
}
