package com.fatihs.coursemanagement.service.impl;

import com.fatihs.coursemanagement.dto.UserDto;
import com.fatihs.coursemanagement.entity.User;
import com.fatihs.coursemanagement.dao.UserRepository;
import com.fatihs.coursemanagement.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public UserDto save(UserDto user) {

        if (user.getEmail() == null) {
            throw new IllegalArgumentException("Username cannot be null");
        }

        User userDb = modelMapper.map(user, User.class);
        userDb = userRepository.save(userDb);
        user.setId(userDb.getId());
        return user;
    }

    @Override
    public UserDto getById(Long id) {
        User u = userRepository.getOne(id);
        return modelMapper.map(u, UserDto.class);
    }

    @Override
    public Page<UserDto> getAllPageable(Pageable pagebale) {

        return null;
    }

    @Override
    public UserDto getByUsername(String username) {
        return null;
    }

    @Override
    public Boolean delete(UserDto user) {
        return null;
    }
}
