package com.aws.mysql.repositories;

import com.aws.mysql.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: UserRepository
 * Inside the package - com.aws.mysql.repositories
 * Created Date: 4/12/2020
 * Created Time: 4:55 PM
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
