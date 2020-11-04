package com.dducks.spicyDiary.wishlist.domain

class WishStore(name: String) {
    private var name = name

    fun changeName(newName: String) {
        setName(newName)
    }

    private fun setName(name: String) {
        this.name = name
    }
}