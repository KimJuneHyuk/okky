package com.example.okky.dtos.bbs;

import java.util.Date;
import java.util.Objects;

public class ArticleDto {
    private int index;
    private int boardId;
    private String memberEmail;
    private String title;
    private String content;
    private long view;
    private Date createdAt;

    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ArticleDto() {
    }

    public ArticleDto(int index, int boardId, String memberEmail, String title, String content,
                      long view, Date createdAt, boolean status) {
        this.index = index;
        this.boardId = boardId;
        this.memberEmail = memberEmail;
        this.title = title;
        this.content = content;
        this.view = view;
        this.createdAt = createdAt;
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleDto that = (ArticleDto) o;
        return index == that.index;
    }

    @Override
    public int hashCode() {
        return Objects.hash(index);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }


    public String getmemberEmail() {
        return memberEmail;
    }

    public void setmemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getView() {
        return view;
    }

    public void setView(long view) {
        this.view = view;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "ArticleDto{" +
                "index=" + index +
                ", boardId='" + boardId + '\'' +
                ", memberEmail='" + memberEmail + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", view=" + view +
                ", createdAt=" + createdAt +
                ", status=" + status +
                '}';
    }
}
