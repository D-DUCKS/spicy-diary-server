package com.dducks.spicyDiary.wishlist.domain

class WishList(location: WishLocation, store: WishStore, registrant: WishListRegistrant) {
//    private val id
    private var place = location
    private var store = store
    private val registrant = registrant

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