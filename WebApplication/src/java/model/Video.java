/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Osmar
 */
public class Video {
    
    private String title;
    private String author;
    private String date;
    private String duration;
    private int reproductions;
    private String description;
    private String format;
    private int id;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Get the value of format
     *
     * @return the value of format
     */
    public String getFormat() {
        return format;
    }

    /**
     * Set the value of format
     *
     * @param format new value of format
     */
    public void setFormat(String format) {
        this.format = format;
    }


    /**
     * Get the value of description
     *
     * @return the value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the value of description
     *
     * @param description new value of description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    

    /**
     * Get the value of reproductions
     *
     * @return the value of reproductions
     */
    public int getReproductions() {
        return reproductions;
    }

    /**
     * Set the value of reproductions
     *
     * @param reproductions new value of reproductions
     */
    public void setReproductions(int reproductions) {
        this.reproductions = reproductions;
    }


    /**
     * Get the value of duration
     *
     * @return the value of duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Set the value of duration
     *
     * @param duration new value of duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }


    /**
     * Get the value of date
     *
     * @return the value of date
     */
    public String getDate() {
        return date;
    }

    /**
     * Set the value of date
     *
     * @param date new value of date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Get the value of author
     *
     * @return the value of author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Set the value of author
     *
     * @param author new value of author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    
    /**
     * Get the value of title
     *
     * @return the value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the value of title
     *
     * @param title new value of title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public void setVideo(int id, String title, String author, String date, String duration, int reproductions, String description, String format, String url){
        this.setId(id);
        this.setTitle(title);
        this.setAuthor(author);
        this.setDate(date);
        this.setDuration(duration);
        this.setReproductions(reproductions);
        this.setDescription(description);
        this.setFormat(format);
        this.setUrl(url);
    }
    
    
}
