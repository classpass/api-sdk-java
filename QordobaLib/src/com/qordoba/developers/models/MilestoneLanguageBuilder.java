/*
 * QordobaLib
 *
 *   by Qordoba BETA v2.0 on 02/25/2016
 */
package com.qordoba.developers.models;

import java.util.*;

public class MilestoneLanguageBuilder {
    //the instance to build
    private MilestoneLanguage milestoneLanguage;

    /**
     * Default constructor to initialize the instance
     */
    public MilestoneLanguageBuilder() {
        milestoneLanguage = new MilestoneLanguage();
    }

    public MilestoneLanguageBuilder languages(List<Language> languages) {
        milestoneLanguage.setLanguages(languages);
        return this;
    }

    public MilestoneLanguageBuilder milestone(Milestone milestone) {
        milestoneLanguage.setMilestone(milestone);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MilestoneLanguage build() {
        return milestoneLanguage;
    }
}