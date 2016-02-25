/*
 * QordobaLib
 *
 *   by Qordoba BETA v2.0 on 02/25/2016
 */
package com.qordoba.developers.models;

import java.util.*;

public class ProjectBuilder {
    //the instance to build
    private Project project;

    /**
     * Default constructor to initialize the instance
     */
    public ProjectBuilder() {
        project = new Project();
    }

    public ProjectBuilder contentType(int contentType) {
        project.setContentType(contentType);
        return this;
    }

    public ProjectBuilder milestones(List<MilestoneLanguage> milestones) {
        project.setMilestones(milestones);
        return this;
    }

    public ProjectBuilder name(String name) {
        project.setName(name);
        return this;
    }

    public ProjectBuilder organizationId(String organizationId) {
        project.setOrganizationId(organizationId);
        return this;
    }

    public ProjectBuilder sourceLanguage(int sourceLanguage) {
        project.setSourceLanguage(sourceLanguage);
        return this;
    }

    public ProjectBuilder stringFiles(List<StringFile> stringFiles) {
        project.setStringFiles(stringFiles);
        return this;
    }

    public ProjectBuilder targetLanguages(List<Integer> targetLanguages) {
        project.setTargetLanguages(targetLanguages);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Project build() {
        return project;
    }
}