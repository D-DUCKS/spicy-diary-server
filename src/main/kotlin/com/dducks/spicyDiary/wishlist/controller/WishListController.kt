package com.dducks.spicyDiary.wishlist.controller

import com.dducks.spicyDiary.wishlist.service.WishListService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController

@RestController
class WishListController {

    @Autowired
    private lateinit var wishListService: WishListService
}