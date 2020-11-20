package com.dducks.spicyDiary.station.controller

import com.dducks.spicyDiary.station.service.StationService
import com.dducks.spicyDiary.station.domian.Station
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/stations")
class StationController(val stationService: StationService) {
    @GetMapping()
    fun getStations(): ResponseEntity<*> {
        val stations = stationService.getStations();

        return ResponseEntity.ok(stations);
    }

    @GetMapping("/{id}")
    fun getStation(@PathVariable id: Short): ResponseEntity<*> {
        val station = stationService.getStation(id);

        return ResponseEntity.ok(station);
    }

    @PostMapping()
    fun createStation(@RequestBody station: Station): ResponseEntity<*> {
        val res = stationService.createStation(station);

        return ResponseEntity.ok(res);
    }

    @PutMapping()
    fun editStation(@RequestBody station: Station): ResponseEntity<*> {
        val res = stationService.updateStation(station)

        return ResponseEntity.ok(res);
    }

    @DeleteMapping("/{id}")
    fun deleteStation(@PathVariable id: Short): ResponseEntity<Unit> {
        return ResponseEntity.ok(stationService.deleteStation(id));
    }
}