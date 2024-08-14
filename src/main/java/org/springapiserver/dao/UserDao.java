package org.springapiserver.dao;

import org.springapiserver.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Integer> {
    public User findByUsername(String username);
}
