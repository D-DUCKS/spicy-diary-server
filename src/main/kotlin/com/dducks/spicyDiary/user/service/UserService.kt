package com.dducks.spicyDiary.user.service

import com.dducks.spicyDiary.user.domian.User
import com.dducks.spicyDiary.user.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(val userRepository: UserRepository) {
    fun getUsers(): List<User> = userRepository.findAll();

    //TODO: orElseThrow로 error 처리
    fun getUser(id: String): User = userRepository.findById(id).orElse(null);

    fun createUser(user: User): User {
        val exist: Optional<User> = userRepository.findById(user.id);
        if (exist.isPresent) {
            throw Exception("존재하는 id 입니다.")
        }
        return userRepository.save(user)
    };

    fun updateUser(user: User): User {
        val updatedUser = getUser(user.id);
        
        updatedUser.name = user.name;
        updatedUser.nickname = user.nickname;
        updatedUser.phoneNum = user.phoneNum;
        updatedUser.picture = user.picture;

        return userRepository.save(updatedUser);
    }

    fun deleteUser(id: String): Unit = userRepository.deleteById(id);
}
