package com.example.carteiraeducada.domain.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "fincards")
public class FinCard {
    @PrimaryKey(autoGenerate = true)
    int id;
    String name;
    Date date;
    Float value;
    Boolean executed;
}
