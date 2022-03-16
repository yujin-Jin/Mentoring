package hello.hellospring.controller;

import hello.hellospring.dto.UserDto;
import hello.hellospring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    // 유저 추가
    @PostMapping("/user")
    public String addUser(
            @RequestBody UserDto userDto
    ) {
        userService.addUser(userDto);

        return "유저가 추가됨";
    }

    // 유저 조회
    @GetMapping("/user")
    public List<UserDto> searchUser() {
        return userService.getUser();
    }

    // 유저 수정
    @PutMapping("/user")
    public String updateUser(
            @RequestBody UserDto userDto
    ) {
        userService.updateUser(userDto);

        return "유저가 수정됨";
    }

    // 유저 삭제
    @DeleteMapping("/user")
    public String deleteUser(
            @RequestParam("id") int id
    ) {

        userService.deleteUser(id);

        return "유저 삭제";
    }

}
