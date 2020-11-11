package com.dducks.spicyDiary.history.domin

class History(historyNo: HistoryNo, subway: HistorySubway, post: HistoryPost, registrant: HistoryUser)
{
    private val historyNo = historyNo
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