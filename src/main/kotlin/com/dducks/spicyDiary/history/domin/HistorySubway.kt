package com.dducks.spicyDiary.history.domin

import javax.persistence.*

@Embeddable
@Access(AccessType.FIELD)
class HistorySubway(subwayId: String) {
    private var subwayId = subwayId

    fun getSubwayId(): String {
        return this.subwayId
    }
}