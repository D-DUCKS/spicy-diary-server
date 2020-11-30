package com.dducks.spicyDiary.history.controller

import com.dducks.spicyDiary.history.service.HistoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController

@RestController
class HistoryController {
    @Autowired
    private lateinit var historyService: HistoryService
}