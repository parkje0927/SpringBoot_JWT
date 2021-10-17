package com.study.jwttutorial.repository;

import com.study.jwttutorial.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @EntityGraph //쿼리가 수행이 될 때 eager 조회로 authorities 정보를 같이 가져온다.
    Optional<User> findOneWithAuthoritiesByUsername(String username);
}
