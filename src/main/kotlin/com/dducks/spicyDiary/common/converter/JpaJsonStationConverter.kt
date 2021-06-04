package com.dducks.spicyDiary.common.converter

import com.dducks.spicyDiary.common.type.CardinalDirection
import com.dducks.spicyDiary.common.type.StationNodeType
import com.dducks.spicyDiary.subway.domain.Coordinates
import com.dducks.spicyDiary.subway.domain.Station
import com.google.gson.Gson
import com.google.gson.JsonParser
import com.google.gson.reflect.TypeToken
import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter
class JpaJsonStationConverter: AttributeConverter<List<Station>, String> {
    var gson = Gson()

    override fun convertToEntityAttribute(value: String?): List<Station> {
        if (value == null)
            return listOf()

        val stationListJson = JsonParser.parseString(value).asJsonArray
        val stations: MutableList<Station> = mutableListOf()
        for (stationJson in stationListJson) {
            val stationObjectJson = stationJson.asJsonObject
            val station = Station()
            val stationId = stationObjectJson.get("station_id")
            if (stationId != null) {
                station.stationId = stationId.asString
            }
            val coordinates = stationObjectJson.get("coordinates");
            if (coordinates != null) {
                val coordinatesXY= coordinates.asString.split(",")
                val coordinatesValue = Coordinates()
                coordinatesValue.x = coordinatesXY.get(0).toFloat()
                coordinatesValue.y = coordinatesXY.get(1).toFloat()
                station.coordinates = coordinatesValue
            }
            val stationName = stationObjectJson.get("station_name")
            if (stationName != null) {
                station.stationName = stationName.asString
            }
            val subName = stationObjectJson.get("sub_name")
            if (subName != null) {
                station.subName = subName.asString
            }
            val labelPosition = stationObjectJson.get("label_position")
            if (labelPosition != null) {
                station.labelPosition = CardinalDirection.valueOf(labelPosition.asString.toUpperCase())
            }
            val nodeType = stationObjectJson.get("node_type")
            if (nodeType != null) {
                station.nodeType = StationNodeType.valueOf(nodeType.asString.toUpperCase())
            }
            val moveTo = stationObjectJson.get("move_to")
            if (moveTo != null) {
                val coordinatesXY= moveTo.asString.split(",")
                val coordinatesValue = Coordinates()
                coordinatesValue.x = coordinatesXY.get(0).toFloat()
                coordinatesValue.y = coordinatesXY.get(1).toFloat()
                station.moveTo = coordinatesValue
            }

            stations.add(station)
        }

        return stations
    }

    override fun convertToDatabaseColumn(attribute: List<Station>?): String {
        if (attribute == null) {
            return ""
        }

        return gson.toJson(attribute)
    }
}