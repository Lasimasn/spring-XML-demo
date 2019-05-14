package com.stackroute.domain;

public class Movie {

    private Actor actor1;
    private Actor actor2;
    private Actor actor3;

    public Actor getActor1() {
        return actor1;
    }

    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }

    public Actor getActor2() {
        return actor2;
    }

    public void setActor2(Actor actor2) {
        this.actor2 = actor2;
    }

    public Actor getActor3() {
        return actor3;
    }

    public void setActor3(Actor actor3) {
        this.actor3 = actor3;
    }

    public void movieOut()
   {
      System.out.println(getActor1().getName()+" is a "+getActor1().getGender()+" actor of age "+getActor1().getAge());
        System.out.println(getActor2().getName()+" is a "+getActor2().getGender()+" actor of age "+getActor2().getAge());
        System.out.println(getActor3().getName()+" is a "+getActor3().getGender()+" actor of age "+getActor3().getAge());
        //System.out.println(getActor1().print());
    }






}
