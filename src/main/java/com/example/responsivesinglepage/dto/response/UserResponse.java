package com.example.responsivesinglepage.dto.response;

import com.example.responsivesinglepage.entity.Roles;
import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserResponse {
    private String id;
    private String name;
    private List<String> sectors;
    private String agree;

    private Roles role;
}
