package hello.hellospring.dao;

import hello.hellospring.dto.UserDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    List<UserDto> selectUser();

    void insertUser(@Param("userDto") UserDto userDto);

    void updateUser(@Param("userDto") UserDto userDto);

    void deleteUser(int id);
}
