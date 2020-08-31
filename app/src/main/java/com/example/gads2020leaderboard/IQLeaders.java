package com.example.gads2020leaderboard;

class IQLeaders {
    private String name, country;
    private int iq;

    public IQLeaders(){
    }

    public IQLeaders(String name, int iq, String country){
        this.name = name;
        this.iq = iq;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
