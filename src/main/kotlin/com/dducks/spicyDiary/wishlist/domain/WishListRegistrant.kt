package com.dducks.spicyDiary.wishlist.domain

import javax.persistence.Embeddable

@Embeddable
class WishListRegistrant(userId: String) {
    private val userId = userId
}