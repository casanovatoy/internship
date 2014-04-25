/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.na5cent.orm.repository;

import com.blogspot.na5cent.orm.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author anonymous
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT user FROM User user WHERE user.user ?user")
    public List<User> findByNameLike(User user);
}
