package com.myapp.film;

public class Content {
    private String name;
    private String image;

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public Content(String name, String image) {
        this.name = name;
        this.image = image;
    }
}
