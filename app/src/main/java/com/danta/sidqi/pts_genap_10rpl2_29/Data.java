package com.danta.sidqi.pts_genap_10rpl2_29;

public class Data {
    private String ttl;
    private String artist;
    private String info;
    private int update;
    private int imgurl;


    public Data(String title, String artist, String info, int update, Integer img){
        this.ttl = title;
        this.artist = artist;
        this.info = info;
        this.update = update;
        this.imgurl = img;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getUpdate() {
        return update;
    }

    public void setUpdate(int update) {
        this.update = update;
    }

    public int getImgurl() {
        return imgurl;
    }

    public void setImgurl(int imgurl) {
        this.imgurl = imgurl;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
