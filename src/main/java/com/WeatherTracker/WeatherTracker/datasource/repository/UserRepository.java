package com.WeatherTracker.WeatherTracker.datasource.repository;

import com.WeatherTracker.WeatherTracker.datasource.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
