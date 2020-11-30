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
}