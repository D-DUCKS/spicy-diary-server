package com.dducks.spicyDiary.history.domin

import java.time.LocalDateTime

class HistoryPost(storeName: String, content: String,
                    photo: String, rating: Float, date: LocalDateTime) {
    private var storeName = storeName
    private var content = content
    private var photo = photo
    private var rating = rating
    private var date = date
}