package com.dducks.spicyDiary.subway.service

import com.dducks.spicyDiary.subway.domian.Subway
import com.dducks.spicyDiary.subway.repository.SubwayRepository
import org.springframework.stereotype.Service

@Service
class SubwayService(val subwayRepository: SubwayRepository) {
    fun getStations(): List<Subway> = subwayRepository.findAll();

    //TODO: orElseThrow로 error 처리
    fun getStation(id: String): Subway = subwayRepository.findById(id).orElse(null);
}