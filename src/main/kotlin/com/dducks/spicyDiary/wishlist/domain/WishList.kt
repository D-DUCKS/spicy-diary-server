package com.dducks.spicyDiary.wishlist.domain

import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class WishList(location: WishLocation, store: WishStore, registrant: WishListRegistrant) {

    @Id
    private lateinit var id:String

    @Embedded
    private var place:WishLocation = location

    @Embedded
    private var store:WishStore = store

    @Embedded
    private val registrant:WishListRegistrant = registrant

    fun changePlace(newPlace: WishLocation) {
        setPlace(newPlace)
    }

    fun changeStoreName(newStoreName: String) {
        store.changeName(newStoreName)
    }

    private fun setPlace(newLocation: WishLocation) {
        this.place = newLocation
    }

}