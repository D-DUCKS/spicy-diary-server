package com.dducks.spicyDiary.party.domain

import java.time.LocalDateTime

class Party(partyLocation: PartyLocation, dateAndTime: LocalDateTime, host: Host) {
//    val id
    val dateAndTime = dateAndTime
    val host = host
}