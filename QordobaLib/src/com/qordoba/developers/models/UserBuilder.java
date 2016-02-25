/*
 * QordobaLib
 *
 *   by Qordoba BETA v2.0 on 02/25/2016
 */
package com.qordoba.developers.models;

import java.util.*;

public class UserBuilder {
    //the instance to build
    private User user;

    /**
     * Default constructor to initialize the instance
     */
    public UserBuilder() {
        user = new User();
    }

    public UserBuilder id(int id) {
        user.setId(id);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public User build() {
        return user;
    }
}