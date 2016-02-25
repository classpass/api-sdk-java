/*
 * QordobaLib
 *
 *   by Qordoba BETA v2.0 on 02/25/2016
 */
package com.qordoba.developers.models;

import java.util.*;

public class MilestoneBuilder {
    //the instance to build
    private Milestone milestone;

    /**
     * Default constructor to initialize the instance
     */
    public MilestoneBuilder() {
        milestone = new Milestone();
    }

    public MilestoneBuilder milestoneId(int milestoneId) {
        milestone.setMilestoneId(milestoneId);
        return this;
    }

    public MilestoneBuilder name(String name) {
        milestone.setName(name);
        return this;
    }

    public MilestoneBuilder order(int order) {
        milestone.setOrder(order);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Milestone build() {
        return milestone;
    }
}