package com.bit189.haroo.domain;

public class Comment {
  private int no;
  private int storyNo;
  private Member member;
  private String comment;
  private boolean state;

  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public int getStoryNo() {
    return storyNo;
  }
  public void setStoryNo(int storyNo) {
    this.storyNo = storyNo;
  }
  public Member getMember() {
    return member;
  }
  public void setMember(Member member) {
    this.member = member;
  }
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }
  public boolean isState() {
    return state;
  }
  public void setState(boolean state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "Comment [no=" + no + ", storyNo=" + storyNo + ", member=" + member + ", comment="
        + comment + ", state=" + state + "]";
  }

}
