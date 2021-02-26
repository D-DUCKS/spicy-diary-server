package com.dducks.spicyDiary.history.domin

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "history")
class History(subway: HistorySubway, storeName: String, content: String, photo: String, rating: Float,
              date: LocalDateTime, location: String, registrant: HistoryUser) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var historyNo: Long? = null

    @Embedded
    private val subway = subway

    private var storeName = storeName
    private var content = content
    private var photo = photo
    private var rating = rating
    private var date = date
    private var location = location

    // TODO : 관계 설정 방법 고민
//    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
//    @JoinColumn(name = "historyNo")
//    private var friends = friends

    @Embedded
    private val registrant = registrant

    constructor() : this(HistorySubway(""), "", "", "", 0.0F, LocalDateTime.now(), "", HistoryUser("", "", ""))

    fun getHistoryNo(): Long? {
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

    fun getLocation(): String {
        return this.location
    }

    fun setLocation(location: String) {
        this.location = location
    }

    fun getRegistrant(): HistoryUser {
        return this.registrant
    }

//    fun getFriends(): Set<HistoryUser> {
//        return this.friends
//    }
//
//    fun setFriends(friends: Set<HistoryUser>) {
//        this.friends = friends
//    }
}