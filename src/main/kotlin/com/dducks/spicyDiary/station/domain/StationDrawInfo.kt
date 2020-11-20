package com.dducks.spicyDiary.station.domian

import javax.persistence.Embeddable

@Embeddable
class StationDrawInfo(color: String, x: Int, y: Int) {
    var color = color;
    var x = x;
    var y = y;
}