package com.dducks.spicyDiary.invitation.domain

import javax.persistence.Entity
import javax.persistence.Id

//@Entity
class Invitation(partyId: String) {

    @Id
    private lateinit var id: String

    private  val partyId = partyId

    private val invitees:HashMap<String, Boolean> = HashMap<String,Boolean>()

    fun addInvitees(memberId: String) {
        invitees.put(memberId, false)
    }

    fun accept(memberId: String) {
        invitees[memberId] = true
    }
}