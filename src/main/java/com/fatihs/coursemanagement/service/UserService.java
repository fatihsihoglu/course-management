package com.fatihs.coursemanagement.service;

import com.fatihs.coursemanagement.dto.UserDto;
import com.fatihs.coursemanagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

   UserDto save(UserDto user);

   UserDto getById(Long id);

   Page<UserDto> getAllPageable(Pageable pagebale);

   UserDto getByUsername(String username);

   Boolean delete(UserDto user);
}
