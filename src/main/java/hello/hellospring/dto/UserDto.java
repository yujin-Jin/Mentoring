package hello.hellospring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private int id;
    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonProperty("birth_day")
    private LocalDate birthDay;
}
