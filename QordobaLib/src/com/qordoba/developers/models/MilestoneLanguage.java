/*
 * QordobaLib
 *
 *   by Qordoba BETA v2.0 on 02/25/2016
 */
package com.qordoba.developers.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MilestoneLanguage 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5471890654236387140L;
    private List<Language> languages;
    private Milestone milestone;
    /** GETTER
     * TODO: 
     */
    @JsonGetter("languages")
    public List<Language> getLanguages ( ) { 
        return this.languages;
    }
    
    /** SETTER
     * TODO: 
     */
    @JsonSetter("languages")
    public void setLanguages (List<Language> value) { 
        this.languages = value;
    }
 
    /** GETTER
     * TODO: 
     */
    @JsonGetter("milestone")
    public Milestone getMilestone ( ) { 
        return this.milestone;
    }
    
    /** SETTER
     * TODO: 
     */
    @JsonSetter("milestone")
    public void setMilestone (Milestone value) { 
        this.milestone = value;
    }
 
}
 