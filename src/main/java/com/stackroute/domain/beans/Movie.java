package com.stackroute.domain.beans;

import java.util.List;

public class Movie {

    private List <Actor> actor1;
    private List <Actor> actor2;
    private List <Actor> actor3;

    public Movie()
    {

    }

    public Movie(List<Actor> actor1, List<Actor> actor2, List<Actor> actor3) {
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
    }

    public List<Actor> getActor1() {
        return actor1;
    }

    public void setActor1(List<Actor> actor1) {
        this.actor1 = actor1;
    }

    public List<Actor> getActor2() {
        return actor2;
    }

    public void setActor2(List<Actor> actor2) {
        this.actor2 = actor2;
    }

    public List<Actor> getActor3() {
        return actor3;
    }

    public void setActor3(List<Actor> actor3) {
        this.actor3 = actor3;
    }

    public void movieOut()
    {
        for(Actor actor:actor1)
            System.out.println(actor.getName()+" , "+actor.getGender()+" , "+actor.getAge());

        for(Actor actor:actor2)
            System.out.println(actor.getName()+" , "+actor.getGender()+" , "+actor.getAge());

        for(Actor actor: actor3)
            System.out.println(actor.getName()+" , "+actor.getGender()+" , "+actor.getAge());

    }
}
