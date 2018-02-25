package com.example.eurekaprovideruser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * liyan-下午3:16
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
