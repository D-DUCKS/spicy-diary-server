package com.dducks.spicyDiary.history.domin

import java.time.LocalDateTime

class HistoryPost(storeName: String, content: String,
                    photo: String, rating: Float, date: LocalDateTime, friendList: List<HistoryUser>) {
    private var storeName = storeName
    private var content = content
    private var photo = photo
    private var rating = rating
    private var date = date
    private var friendList = friendList
}