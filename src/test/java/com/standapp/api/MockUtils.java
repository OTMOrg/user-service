package com.standapp.api;

import com.standapp.api.userservice.models.dto.UserDTO;

public class MockUtils {

    public static UserDTO getUserDTO() {
        UserDTO userDto = new UserDTO();
        return userDto;
    }

}