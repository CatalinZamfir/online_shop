package org.example.repository;

import org.example.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {

    List<UserEntity> findAllByName(String name);
    List<UserEntity> findAllByNameAndAge(String name, Integer age);
    List<UserEntity> findAllByNameOrderByAge(String name);

    @Query("from UserEntity where name=?1")
    List<UserEntity> getByName (String name);

    @Query("from UserEntity where name=?1 and age=?2")
    List<UserEntity> getByNameAndAge (String name, Integer age);


}
