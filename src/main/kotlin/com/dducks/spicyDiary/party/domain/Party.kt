package com.dducks.spicyDiary.party.domain

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Party(wishListId: WishListId, dateAndTime: LocalDateTime, hostId: HostId) {
//    val id

    @Embedded
    @AttributeOverride(name = "id", column = Column(name = "wishlist_id"))
    val wishListId:WishListId = wishListId

    @Embedded
    val dateAndTime:LocalDateTime = dateAndTime

    @Embedded
    @AttributeOverride(name = "id", column = Column(name = "host_id"))
    val hostId:HostId = hostId
}