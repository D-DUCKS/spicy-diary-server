package com.dducks.spicyDiary.subway.domain

import com.dducks.spicyDiary.common.type.CardinalDirection
import com.dducks.spicyDiary.common.type.StationNodeType
import com.fasterxml.jackson.annotation.JsonInclude
import org.springframework.data.annotation.Immutable

@JsonInclude(JsonInclude.Include.NON_NULL)
@Immutable
data class Station (
    var stationId: String? = null,

    var coordinates: Coordinates? = null,

    var stationName: String? = null,

    var subName: String? = null,

    var labelPosition: CardinalDirection? = null,

    var nodeType: StationNodeType? = null,

    var moveTo: Coordinates? = null
)