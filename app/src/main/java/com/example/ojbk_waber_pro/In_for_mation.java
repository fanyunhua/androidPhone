package com.example.ojbk_waber_pro;

public class In_for_mation {

    private String name;
    private String tel;
    private String camera;
    private String location;
    private String postbox;

    public In_for_mation(String name, String tel, String camera, String location, String postbox) {
        this.name = name;
        this.tel = tel;
        this.camera = camera;
        this.location = location;
        this.postbox = postbox;
    }
    public In_for_mation() {

    }
    public In_for_mation(String name,String tel)
    {
        this.name = name;
        this.tel = tel;
    }



    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public String getCamera() {
        return camera;
    }

    public String getLocation() {
        return location;
    }

    public String getPostbox() {
        return postbox;
    }

    public void setName(String name) {
        this.name = name;
    }

}
