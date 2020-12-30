package com.dducks.spicyDiary.subway.repository

import com.dducks.spicyDiary.subway.domian.Subway
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SubwayRepository: JpaRepository<Subway, String> {
}