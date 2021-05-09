package com.bit189.haroo.domain;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class Question extends Post {
  private Member writer;
  private String title;
  private boolean secret;
  private String replyContent;
  private Date replyDate;
  private Time replyTime;
  private ArrayList<String> replyAttachedFile;
}