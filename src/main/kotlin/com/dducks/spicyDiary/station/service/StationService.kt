package com.dducks.spicyDiary.station.service

import com.dducks.spicyDiary.station.domian.Station
import com.dducks.spicyDiary.station.repository.StationRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class StationService(val stationRepository: StationRepository) {
    fun getStations(): List<Station> = stationRepository.findAll();

    //TODO: orElseThrow로 error 처리
    fun getStation(routeId: Short): Station = stationRepository.findById(routeId).orElse(null);

    fun createStation(station: Station): Station {
        val exist: Optional<Station> = stationRepository.findById(station.routeId);
        if (exist.isPresent) {
            throw Exception("존재하는 id 입니다.")
        }
        return stationRepository.save(station);
    }

    fun updateStation(station: Station): Station {
        val updatedStation = getStation(station.routeId);

        updatedStation.routeName = station.routeName;
        updatedStation.stationId = station.stationId;
        updatedStation.stationName = station.stationName;
        updatedStation.stationDrawInfo = station.stationDrawInfo;

        return stationRepository.save(updatedStation);
    }

    fun deleteStation(routeId: Short): Unit = stationRepository.deleteById(routeId);
}