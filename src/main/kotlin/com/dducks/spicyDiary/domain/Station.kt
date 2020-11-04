package com.dducks.spicyDiary.domian

import java.time.LocalDateTime

data class Station {
    var routeId: Short,
    var routeName: String,
    var stationId: Short,
    var stationName: String,
    var color: String,
    var x: Int,
    var y: Int,
    var createdAt: LocalDateTime,
    var updatedAt: LocalDateTime
}