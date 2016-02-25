/*
 * QordobaLib
 *
 *   by Qordoba BETA v2.0 on 02/25/2016
 */
package com.qordoba.developers.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class User 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5042626710027886839L;
    private int id;
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
 
}
 