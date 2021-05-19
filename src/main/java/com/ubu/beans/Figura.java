/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubu.beans;

import java.util.Objects;

/**
 *
 * @author david
 */
public abstract class Figura {
    
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.color);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass()!= getClass()) {
            return false;
        }
        final Figura other = (Figura) obj;
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }
    
    public abstract double area();

    
}
