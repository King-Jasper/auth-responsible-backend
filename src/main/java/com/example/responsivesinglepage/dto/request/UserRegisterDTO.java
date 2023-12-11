package com.example.responsivesinglepage.dto.request;
import java.util.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserRegisterDTO {
    private String name;
    private List<String> sectors;
    private Boolean agree;
    private String password;
}
