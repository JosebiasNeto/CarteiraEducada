package com.example.carteiraeducada.domain.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "fincards")
public class FinCard {
    @PrimaryKey(autoGenerate = true)
    int id;
    String name;
    String date;
    Float value;
    Boolean executed;

    public void setName(String name){
        this.name = name;
    }
    public void setDate(String date){
        this.date = date;
    }
    public void setValue(Float value){
        this.value = value;
    }
    public void setExecuted(Boolean executed){
        this.executed = executed;
    }
    public String getName(){
        return this.name;
    }
    public String getDate(){
        return this.date;
    }
    public Float getValue(){
        return this.value;
    }
    public Boolean getExecuted(){
        return this.executed;
    }
}
