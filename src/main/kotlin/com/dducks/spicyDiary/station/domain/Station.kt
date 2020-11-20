package com.dducks.spicyDiary.station.domian

import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "station")
class Station (routeId: Short, routeName: String, stationId: Short, stationName: String, stationDrawInfo: StationDrawInfo) {
    @Id
    var routeId = routeId;

    var routeName = routeName;

    var stationId = stationId;

    var stationName = stationName;

    @Embedded
    var stationDrawInfo = stationDrawInfo;
}