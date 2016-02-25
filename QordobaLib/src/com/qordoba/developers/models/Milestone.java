/*
 * QordobaLib
 *
 *   by Qordoba BETA v2.0 on 02/25/2016
 */
package com.qordoba.developers.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Milestone 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4902454035164218148L;
    private int milestoneId;
    private String name;
    private int order;
    /** GETTER
     * TODO: 
     */
    @JsonGetter("milestone_id")
    public int getMilestoneId ( ) { 
        return this.milestoneId;
    }
    
    /** SETTER
     * TODO: 
     */
    @JsonSetter("milestone_id")
    public void setMilestoneId (int value) { 
        this.milestoneId = value;
    }
 
    /** GETTER
     * TODO: 
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: 
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * TODO: 
     */
    @JsonGetter("order")
    public int getOrder ( ) { 
        return this.order;
    }
    
    /** SETTER
     * TODO: 
     */
    @JsonSetter("order")
    public void setOrder (int value) { 
        this.order = value;
    }
 
}
 