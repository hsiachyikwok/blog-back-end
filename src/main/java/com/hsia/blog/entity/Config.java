package com.hsia.blog.entity;

import java.util.Date;

public class Config {
    private String id;

    private String userName;

    private String password;

    private String avatar;

    private String blogTitle;

    private String blogSubTitle;

    private String blogLogo;

    private String favicon;

    private String metaKeywords;

    private String metaDesc;

    private String footer;

    private String notice;

    private String allowComment;

    private Date createTime;

    private Date updateTime;

    private String listStyle;

    private Integer recentCommentSize;

    private Integer pageSize;

    private Integer pageWidth;

    private Integer mostViewSize;

    private Integer mostCommentSize;

    private Integer usedTagSize;

    private String location;

    private String about;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    public String getBlogSubTitle() {
        return blogSubTitle;
    }

    public void setBlogSubTitle(String blogSubTitle) {
        this.blogSubTitle = blogSubTitle == null ? null : blogSubTitle.trim();
    }

    public String getBlogLogo() {
        return blogLogo;
    }

    public void setBlogLogo(String blogLogo) {
        this.blogLogo = blogLogo == null ? null : blogLogo.trim();
    }

    public String getFavicon() {
        return favicon;
    }

    public void setFavicon(String favicon) {
        this.favicon = favicon == null ? null : favicon.trim();
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords == null ? null : metaKeywords.trim();
    }

    public String getMetaDesc() {
        return metaDesc;
    }

    public void setMetaDesc(String metaDesc) {
        this.metaDesc = metaDesc == null ? null : metaDesc.trim();
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer == null ? null : footer.trim();
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice == null ? null : notice.trim();
    }

    public String getAllowComment() {
        return allowComment;
    }

    public void setAllowComment(String allowComment) {
        this.allowComment = allowComment == null ? null : allowComment.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getListStyle() {
        return listStyle;
    }

    public void setListStyle(String listStyle) {
        this.listStyle = listStyle == null ? null : listStyle.trim();
    }

    public Integer getRecentCommentSize() {
        return recentCommentSize;
    }

    public void setRecentCommentSize(Integer recentCommentSize) {
        this.recentCommentSize = recentCommentSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageWidth() {
        return pageWidth;
    }

    public void setPageWidth(Integer pageWidth) {
        this.pageWidth = pageWidth;
    }

    public Integer getMostViewSize() {
        return mostViewSize;
    }

    public void setMostViewSize(Integer mostViewSize) {
        this.mostViewSize = mostViewSize;
    }

    public Integer getMostCommentSize() {
        return mostCommentSize;
    }

    public void setMostCommentSize(Integer mostCommentSize) {
        this.mostCommentSize = mostCommentSize;
    }

    public Integer getUsedTagSize() {
        return usedTagSize;
    }

    public void setUsedTagSize(Integer usedTagSize) {
        this.usedTagSize = usedTagSize;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about == null ? null : about.trim();
    }
}