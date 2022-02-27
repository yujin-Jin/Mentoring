package hello.hellospring.dao;

import hello.hellospring.dto.UserDto;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;

public interface UserDao {

    UserDto selectUser(int id);

    void insertUser(@Param("userDto") UserDto userDto);

    void updateUser(@Param("userDto") UserDto userDto);

    void deleteUser(int id);
}
