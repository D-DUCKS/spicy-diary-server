package com.dducks.spicyDiary.history.domin

class History(subway: HistorySubway, post: HistoryPost, registrant: HistoryUser)
{
    private lateinit var historyNo: HistoryNo
    private val subway = subway
    private var post = post
    private val registrant = registrant

    fun changePost(newPost: HistoryPost) {
        setPost(newPost)
    }

    private fun setPost(newPost: HistoryPost) {
        this.post = newPost
    }


}