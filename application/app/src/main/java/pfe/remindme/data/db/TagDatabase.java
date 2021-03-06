package pfe.remindme.data.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import pfe.remindme.data.DataConverter;
import pfe.remindme.data.entity.TagEntity;

/**
 * La base de données en charge de la gestion des tags
 */
@Database(entities = { TagEntity.class }, version = 1, exportSchema = false)
@TypeConverters({DataConverter.class})
public abstract class TagDatabase extends RoomDatabase {
    public abstract TagDao tagDao();
}
