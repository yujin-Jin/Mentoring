package hello.hellospring.service;

import hello.hellospring.dao.UserDao;
import hello.hellospring.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    // 유저 추가
    public void addUser(UserDto userDto) {

        userDao.insertUser(userDto);
    }

    // 유저 조회
    public List<UserDto> getUser() {

        return userDao.selectUser();
    }

    // 유저 수정
    public void updateUser(UserDto userDto) {
        userDao.updateUser(userDto);

    }

    // 유저 삭제
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }


}
