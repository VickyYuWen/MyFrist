package com.hc.yuwen.entities;

import java.util.Date;

public class NewsDetail {
    private Integer id;

    private String title;

    private String summary;

    private String author;

    private Date creantedate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Date getCreantedate() {
        return creantedate;
    }

    public void setCreantedate(Date creantedate) {
        this.creantedate = creantedate;
    }

	@Override
	public String toString() {
		return "NewsDetail [id=" + id + ", title=" + title + ", summary=" + summary + ", author=" + author
				+ ", creantedate=" + creantedate + "]";
	}
    
}