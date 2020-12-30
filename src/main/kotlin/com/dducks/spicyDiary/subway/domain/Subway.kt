package com.dducks.spicyDiary.subway.domian

import com.dducks.spicyDiary.common.converter.JpaJsonStationConverter
import com.dducks.spicyDiary.subway.domain.Station
import org.hibernate.annotations.Immutable
import javax.persistence.*

@Immutable
@Entity
@Table(name = "subway")
class Subway (_label: String, _indicatorText: String, _color: String, _stations: List<Station>) {
    @Id
    private lateinit var id:String

    var label: String = _label

    @Column(name = "indicator_text")
    var indicatorText = _indicatorText

    var color: String = _color

    @Convert(converter = JpaJsonStationConverter::class)
    var stations: List<Station> = _stations
}