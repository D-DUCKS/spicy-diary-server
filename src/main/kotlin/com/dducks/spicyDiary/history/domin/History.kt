package com.dducks.spicyDiary.history.domin

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "history")
class History(subway: HistorySubway, storeName: String, content: String, photo: String, rating: Float,
              date: LocalDateTime, friends: Set<HistoryUser>, registrant: String) {
    @Id
    private lateinit var historyNo: HistoryNo

    @Embedded
    private val subway = subway

    private var storeName = storeName
    private var content = content
    private var photo = photo
    private var rating = rating
    private var date = date

    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    @JoinColumn(name = "historyNo")
    private var friends = friends

    private val registrant = registrant

    fun getHistoryNo(): HistoryNo {
        return this.historyNo
    }

    fun getStoreName(): String {
        return this.storeName
    }

    fun setStoreName(storeName: String) {
        this.storeName = storeName
    }

    fun getContent(): String {
        return this.content
    }

    fun setContent(content: String) {
        this.content = content
    }

    fun getPhoto(): String {
        return this.photo
    }

    fun setPhoto(photo: String) {
        this.photo = photo
    }

    fun getRating(): Float {
        return this.rating
    }

    fun setRating(rating: Float) {
        this.rating = rating
    }

    fun setDate() {
        this.date = LocalDateTime.now()
    }

    fun getFriends(): Set<HistoryUser> {
        return this.friends
    }

    fun setFriends(friends: Set<HistoryUser>) {
        this.friends = friends
    }
}