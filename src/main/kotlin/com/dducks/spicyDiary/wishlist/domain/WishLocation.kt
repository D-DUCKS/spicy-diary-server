package com.dducks.spicyDiary.wishlist.domain

import javax.persistence.Embeddable

@Embeddable
class WishLocation(subwayId: String) {
    val subwayId = subwayId
}