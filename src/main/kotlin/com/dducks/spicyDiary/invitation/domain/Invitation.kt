package com.dducks.spicyDiary.invitation.domain

class Invitation(partyId: String) {
    val partyId = partyId
    val invitees:HashMap<String, Boolean> = HashMap<String,Boolean>()

    fun addInvitees(memberId: String) {
        invitees.put(memberId, false)
    }

    fun accept(memberId: String) {
        invitees[memberId] = true
    }
}