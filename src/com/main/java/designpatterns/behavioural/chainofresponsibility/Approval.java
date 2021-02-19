package com.main.java.designpatterns.behavioural.chainofresponsibility;

import java.io.Serializable;

public class Approval implements Serializable {

  private boolean hasSupervisorApproved;

  private boolean isReviewedByPanel;

  private boolean hasDivisionManagerApproved;

  public boolean isHasSupervisorApproved() {
    return hasSupervisorApproved;
  }

  public void setHasSupervisorApproved(boolean hasSupervisorApproved) {
    this.hasSupervisorApproved = hasSupervisorApproved;
  }

  public boolean isReviewedByPanel() {
    return isReviewedByPanel;
  }

  public void setReviewedByPanel(boolean reviewedByPanel) {
    isReviewedByPanel = reviewedByPanel;
  }

  public boolean isHasDivisionManagerApproved() {
    return hasDivisionManagerApproved;
  }

  public void setHasDivisionManagerApproved(boolean hasDivisionManagerApproved) {
    this.hasDivisionManagerApproved = hasDivisionManagerApproved;
  }

  @Override
  public String toString() {
    return "Approval{" +
            "hasSupervisorApproved=" + hasSupervisorApproved +
            ", isReviewedByPanel=" + isReviewedByPanel +
            ", hasDivisionManagerApproved=" + hasDivisionManagerApproved +
            '}';
  }
}