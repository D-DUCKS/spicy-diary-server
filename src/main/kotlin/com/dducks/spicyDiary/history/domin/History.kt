package com.dducks.spicyDiary.history.domin

class History(var id : Int, var lineNo : Int, var stationNo : Int,
              var visited : Boolean, var storeName : String, var content : String,
              var registrant : String, var photo : String, var rating : Float,
              var date : Long, var friends : Array<User>
)
{
    fun addHistory(history: History): Boolean {
        return false
    }

    fun modifyHistory(history: History): Boolean {
        return false
    }

    fun deleteHistory(id: Int, lineNo: Int, stationNo: Int): Boolean {
        return false
    }

    fun searchHistory(id: Int, lineNo: Int, stationNo: Int): History {
        return this
    }

    fun searchHistories(lineNo: Int, stationNo: Int, visited: Boolean): Array<History> {
        return arrayOf()
    }
}