package com.bit189.haroo.domain;

public class Feed extends Post{
  private int no;
  private Tutor tutor;

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public Tutor getTutor() {
    return tutor;
  }

  public void setTutor(Tutor tutor) {
    this.tutor = tutor;
  }


}
