/*
 * QordobaLib
 *
 *   by Qordoba BETA v2.0 on 02/25/2016
 */
package com.qordoba.developers.models;

import java.util.*;

public class LanguageBuilder {
    //the instance to build
    private Language language;

    /**
     * Default constructor to initialize the instance
     */
    public LanguageBuilder() {
        language = new Language();
    }

    public LanguageBuilder id(int id) {
        language.setId(id);
        return this;
    }

    public LanguageBuilder users(List<User> users) {
        language.setUsers(users);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Language build() {
        return language;
    }
}