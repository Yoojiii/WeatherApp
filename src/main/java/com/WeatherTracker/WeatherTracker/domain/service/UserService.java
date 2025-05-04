package com.WeatherTracker.WeatherTracker.domain.service;

import com.WeatherTracker.WeatherTracker.datasource.mapper.UserEntityMapper;
import com.WeatherTracker.WeatherTracker.datasource.model.UserEntity;
import com.WeatherTracker.WeatherTracker.datasource.repository.UserRepository;
import com.WeatherTracker.WeatherTracker.domain.model.UserModel;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;
    private final PasswordEncoder passwordEncoder;


    public UserService(UserRepository userRepository, UserEntityMapper userEntityMapper, PasswordEncoder passwordEncoder){
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
        this.passwordEncoder = passwordEncoder;
    }

    public String createUser(UserModel userModel){
        String hashedPassword = passwordEncoder.encode(userModel.getHashPassword());
        userModel.setHashPassword(hashedPassword);
        userRepository.save(userEntityMapper.toDatasource(userModel));
        return "User : " + userModel.getNickname() + " was saved";
    }

//    public String findByNickname(String nickname){
//        Optional<UserEntity> optionalUser = userRepository.findByNickname(nickname);
//
//        if (optionalUser.isPresent()){
//            return "Login to account!";
//        }
//
//        return "Some problems with login...";
//    }
}
