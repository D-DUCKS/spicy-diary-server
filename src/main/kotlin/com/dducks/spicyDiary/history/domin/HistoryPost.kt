package com.dducks.spicyDiary.history.domin

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "history_post")
@Embeddable
class HistoryPost(postId: Long, storeName: String, content: String,
                    photo: String, rating: Float, date: LocalDateTime, friendList: List<HistoryUser>) {
    @Id
    private val postId = postId
    private var storeName = storeName
    private var content = content
    private var photo = photo
    private var rating = rating
    private var date = date
    @OneToMany
    private var friendList = friendList
}