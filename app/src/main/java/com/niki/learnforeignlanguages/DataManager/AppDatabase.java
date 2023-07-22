package com.niki.learnforeignlanguages.DataManager;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.niki.learnforeignlanguages.DataManager.DataAccess.LanguageDao;
import com.niki.learnforeignlanguages.DataManager.DataAccess.WordDao;
import com.niki.learnforeignlanguages.DataManager.DataEntities.Language;
import com.niki.learnforeignlanguages.DataManager.DataEntities.Word;

@Database(entities = {Language.class, Word.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract LanguageDao languageDao();
    public abstract WordDao wordDao();
}
