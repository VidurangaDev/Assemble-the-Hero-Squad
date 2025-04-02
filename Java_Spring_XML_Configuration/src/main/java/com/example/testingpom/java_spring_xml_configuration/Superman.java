package com.example.testingpom.java_spring_xml_configuration;


public class Superman implements Hero {
    protected String powerLevel;
    protected int experience;

    public Superman(String powerLevel, int experience) {
        this.powerLevel = powerLevel;
        this.experience = experience;
    }

    @Override
    public void action() {
        System.out.println("Superman with power level " + powerLevel + " and " + experience + " years of experience is flying!");
    }
}
