/*
 * QordobaLib
 *
 *   by Qordoba BETA v2.0 on 02/25/2016
 */
package com.qordoba.developers.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class StringFile 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5421196236415474611L;
    private String fileName;
    private String fileType;
    private String id;
    private List<Integer> sourceColumns;
    /** GETTER
     * TODO: 
     */
    @JsonGetter("file_name")
    public String getFileName ( ) { 
        return this.fileName;
    }
    
    /** SETTER
     * TODO: 
     */
    @JsonSetter("file_name")
    public void setFileName (String value) { 
        this.fileName = value;
    }
 
    /** GETTER
     * TODO: 
     */
    @JsonGetter("file_type")
    public String getFileType ( ) { 
        return this.fileType;
    }
    
    /** SETTER
     * TODO: 
     */
    @JsonSetter("file_type")
    public void setFileType (String value) { 
        this.fileType = value;
    }
 
    /** GETTER
     * TODO: 
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: 
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * TODO: 
     */
    @JsonGetter("source_columns")
    public List<Integer> getSourceColumns ( ) { 
        return this.sourceColumns;
    }
    
    /** SETTER
     * TODO: 
     */
    @JsonSetter("source_columns")
    public void setSourceColumns (List<Integer> value) { 
        this.sourceColumns = value;
    }
 
}
 