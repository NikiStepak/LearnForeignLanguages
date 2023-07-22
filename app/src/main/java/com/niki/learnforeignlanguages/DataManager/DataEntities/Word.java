package com.niki.learnforeignlanguages.DataManager.DataEntities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Word {
    @PrimaryKey
    public int id;

    @ColumnInfo(name = "foreign_word")
    public String foreignWord;

    @ColumnInfo(name = "translate_word")
    public String translateWord;
}
