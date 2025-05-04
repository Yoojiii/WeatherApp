package com.WeatherTracker.WeatherTracker.datasource.repository;

import com.WeatherTracker.WeatherTracker.datasource.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
//    @Query(value = "SELECT * FROM weatherapp.users WHERE nickname = :nickname", nativeQuery = true)
//    Optional<UserEntity> findByNickname(@Param("nickname") String nickname);
    //@Param("nickname") String "'Piko'"
//    @Query("SELECT u FROM UserEntity u WHERE u.nickname LIKE %:nickname%")
//    Optional<UserEntity> findByNickname(@Param("nickname") String nickname);
    //Optional<UserEntity> findByNickname(String nickname);
}
