/*
 * QordobaLib
 *
 *   by Qordoba BETA v2.0 on 02/25/2016
 */
package com.qordoba.developers.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Language 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5578623876228522427L;
    private int id;
    private List<User> users;
    /** GETTER
     * TODO: 
     */
    @JsonGetter("id")
    public int getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: 
     */
    @JsonSetter("id")
    public void setId (int value) { 
        this.id = value;
    }
 
    /** GETTER
     * TODO: 
     */
    @JsonGetter("users")
    public List<User> getUsers ( ) { 
        return this.users;
    }
    
    /** SETTER
     * TODO: 
     */
    @JsonSetter("users")
    public void setUsers (List<User> value) { 
        this.users = value;
    }
 
}
 