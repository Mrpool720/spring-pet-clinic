package com.mrpool720.springpetclinic.model;

public class PetType extends BaseEntity{

    private String petName;

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
}
