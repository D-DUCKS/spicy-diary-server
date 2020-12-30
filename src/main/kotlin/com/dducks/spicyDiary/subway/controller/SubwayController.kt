package com.dducks.spicyDiary.subway.controller

import com.dducks.spicyDiary.subway.service.SubwayService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/subway")
class SubwayController(val subwayService: SubwayService) {
    @GetMapping()
    fun getStations(): ResponseEntity<*> {
        val stations = subwayService.getStations();

        return ResponseEntity.ok(stations);
    }

    @GetMapping("/{id}")
    fun getStation(@PathVariable id: String): ResponseEntity<*> {
        val station = subwayService.getStation(id);

        return ResponseEntity.ok(station);
    }
}