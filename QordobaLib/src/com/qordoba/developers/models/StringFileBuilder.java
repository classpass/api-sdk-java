/*
 * QordobaLib
 *
 *   by Qordoba BETA v2.0 on 02/25/2016
 */
package com.qordoba.developers.models;

import java.util.*;

public class StringFileBuilder {
    //the instance to build
    private StringFile stringFile;

    /**
     * Default constructor to initialize the instance
     */
    public StringFileBuilder() {
        stringFile = new StringFile();
    }

    public StringFileBuilder fileName(String fileName) {
        stringFile.setFileName(fileName);
        return this;
    }

    public StringFileBuilder fileType(String fileType) {
        stringFile.setFileType(fileType);
        return this;
    }

    public StringFileBuilder id(String id) {
        stringFile.setId(id);
        return this;
    }

    public StringFileBuilder sourceColumns(List<Integer> sourceColumns) {
        stringFile.setSourceColumns(sourceColumns);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public StringFile build() {
        return stringFile;
    }
}