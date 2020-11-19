package com.dducks.spicyDiary.history.domin

import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "history")
class History(subway: HistorySubway, post: HistoryPost, registrant: HistoryUser)
{
    @Id
    private lateinit var historyNo: HistoryNo
    @Embedded
    private val subway = subway
    @Embedded
    private var post = post
    @Embedded
    private val registrant = registrant

    fun changePost(newPost: HistoryPost) {
        setPost(newPost)
    }

    private fun setPost(newPost: HistoryPost) {
        this.post = newPost
    }
}