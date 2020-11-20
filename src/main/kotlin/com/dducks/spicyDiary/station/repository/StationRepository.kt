package com.dducks.spicyDiary.station.repository

import com.dducks.spicyDiary.station.domian.Station
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StationRepository: JpaRepository<Station, Short> {
}