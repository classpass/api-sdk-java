/*
 * QordobaLib
 *
 *   by Qordoba BETA v2.0 on 02/25/2016
 */
package com.qordoba.developers.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Project 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5506312538627774844L;
    private int contentType;
    private List<MilestoneLanguage> milestones;
    private String name;
    private String organizationId;
    private int sourceLanguage;
    private List<StringFile> stringFiles;
    private List<Integer> targetLanguages;
    /** GETTER
     * TODO: 
     */
    @JsonGetter("content_type")
    public int getContentType ( ) { 
        return this.contentType;
    }
    
    /** SETTER
     * TODO: 
     */
    @JsonSetter("content_type")
    public void setContentType (int value) { 
        this.contentType = value;
    }
 
    /** GETTER
     * TODO: 
     */
    @JsonGetter("milestones")
    public List<MilestoneLanguage> getMilestones ( ) { 
        return this.milestones;
    }
    
    /** SETTER
     * TODO: 
     */
    @JsonSetter("milestones")
    public void setMilestones (List<MilestoneLanguage> value) { 
        this.milestones = value;
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
    @JsonGetter("organization_id")
    public String getOrganizationId ( ) { 
        return this.organizationId;
    }
    
    /** SETTER
     * TODO: 
     */
    @JsonSetter("organization_id")
    public void setOrganizationId (String value) { 
        this.organizationId = value;
    }
 
    /** GETTER
     * TODO: 
     */
    @JsonGetter("source_language")
    public int getSourceLanguage ( ) { 
        return this.sourceLanguage;
    }
    
    /** SETTER
     * TODO: 
     */
    @JsonSetter("source_language")
    public void setSourceLanguage (int value) { 
        this.sourceLanguage = value;
    }
 
    /** GETTER
     * TODO: 
     */
    @JsonGetter("string_files")
    public List<StringFile> getStringFiles ( ) { 
        return this.stringFiles;
    }
    
    /** SETTER
     * TODO: 
     */
    @JsonSetter("string_files")
    public void setStringFiles (List<StringFile> value) { 
        this.stringFiles = value;
    }
 
    /** GETTER
     * TODO: 
     */
    @JsonGetter("target_languages")
    public List<Integer> getTargetLanguages ( ) { 
        return this.targetLanguages;
    }
    
    /** SETTER
     * TODO: 
     */
    @JsonSetter("target_languages")
    public void setTargetLanguages (List<Integer> value) { 
        this.targetLanguages = value;
    }
 
}
 