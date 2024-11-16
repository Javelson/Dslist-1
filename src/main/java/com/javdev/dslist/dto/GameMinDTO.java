package com.javdev.dslist.dto;

import com.javdev.dslist.entities.Game;
import com.javdev.dslist.projection.GameMinProjetion;
public class GameMinDTO {
    
    private long id;

    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;
    
    public GameMinDTO(){
     }

    public GameMinDTO(Game entity) {
        id =entity.getId();
        title =entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }
    public GameMinDTO(GameMinProjetion projetion) {
        id =projetion.getId();
        title =projetion.getTitle();
        year = projetion.getYear();
        imgUrl = projetion.getimgUrl();
        shortDescription = projetion.getshortDescription();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
    
     

}
