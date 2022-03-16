package hello.hellospring.controller;

import hello.hellospring.dto.UserDto;
import hello.hellospring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    /**
     * 1. 유저 추가 -> index 자동 추가
     * 2. 유저 조회
     * 3. 유저 수정
     * 4. 유저 삭제
     */
    @Autowired
    private UserService userService;

    // 유저 추가
    @PostMapping("/user")
    public Map<String, Object> addUser(
            @RequestBody UserDto userDto
    ) {
        userService.addUser(userDto);

        Map<String, Object> map = new HashMap<>();
        map.put("result", true);
        map.put("message", "유저가 추가됨");

        return map;
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
