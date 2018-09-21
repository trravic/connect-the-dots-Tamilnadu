package com.example.thiyagu22.connect_the_dots_tamilnadu;

/**
 * Created by thiyagu22 on 18-09-2018.
 */

public class districts {

    private String district_name;
    private int dist_photo;
    private String description;

    public districts(){

    }


    public districts(String dist_name,int photo,String description){
        district_name  = dist_name;
        dist_photo = photo;
        this.description = description;
    }

    public void setDistrictName(String dist_name){
        district_name = dist_name;
    }

    public String getDistrict_name(){
        return district_name;
    }

    public int getDist_photo(){
        return dist_photo;
    }

    public void setDist_photo(int photo){
        dist_photo = photo;
    }

    public String getDescription(){
        return description;
    }


    public void setDescription(String description){
        this.description = description;
    }






}
