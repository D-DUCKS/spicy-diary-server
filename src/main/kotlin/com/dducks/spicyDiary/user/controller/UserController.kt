package com.dducks.spicyDiary.user.controller

import com.dducks.spicyDiary.user.domian.User
import com.dducks.spicyDiary.user.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(val userService: UserService) {
    @GetMapping()
    fun getUsers(): ResponseEntity<*> {
        val users = userService.getUsers();

        return ResponseEntity.ok(users)
    }

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: String): ResponseEntity<*> {
        val user = userService.getUser(id);

        return ResponseEntity.ok(user);
    }

    @PostMapping()
    fun createUser(@RequestBody user: User): ResponseEntity<*> {
        val res = userService.createUser(user);

        return ResponseEntity.ok(res)
    }

    @PutMapping()
    fun editUser(@RequestBody user:User): ResponseEntity<*> {
        val res = userService.updateUser(user);

        return ResponseEntity.ok(res);
    }

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: String): ResponseEntity<Unit>{
        return ResponseEntity.ok(userService.deleteUser(id));
    }
}