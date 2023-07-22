package com.niki.learnforeignlanguages.DataManager.DataEntities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Language {
    @PrimaryKey
    public int id;

    @ColumnInfo(name = "language_name")
    public String languageName;
}
