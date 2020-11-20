package com.dducks.spicyDiary.user.repository

import com.dducks.spicyDiary.user.domian.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<User, String> {
}