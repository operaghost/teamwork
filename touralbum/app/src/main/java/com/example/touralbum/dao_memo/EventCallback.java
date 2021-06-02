package com.example.touralbum.dao_memo;

import android.database.Cursor;
import android.provider.BaseColumns;

import com.example.touralbum.common_memo.ColumnContacts;
import com.example.touralbum.common_memo.DBCallback;
import com.example.touralbum.entity_memo.Event;

public class EventCallback implements DBCallback<Event> {
    @Override
    public Event cursorToInstance(Cursor cursor) {
        Event event = new Event();
        event.setmId(cursor.getInt(cursor.getColumnIndexOrThrow(BaseColumns._ID)));
        event.setmTitle(cursor.getString(cursor.getColumnIndexOrThrow(ColumnContacts.EVENT_TITLE_COLUMN)));
        event.setmContent(cursor.getString(cursor.getColumnIndexOrThrow(ColumnContacts.EVENT_CONTENT_COLUMN)));
        event.setmCreatedTime(cursor.getString(cursor.getColumnIndexOrThrow(ColumnContacts.EVENT_CREATED_TIME_COLUMN)));
        event.setmUpdatedTime(cursor.getString(cursor.getColumnIndexOrThrow(ColumnContacts.EVENT_UPDATED_TIME_COLUMN)));
        event.setmRemindTime(cursor.getString(cursor.getColumnIndexOrThrow(ColumnContacts.EVENT_REMIND_TIME_COLUMN)));
        event.setmIsImportant(cursor.getInt(cursor.getColumnIndexOrThrow(ColumnContacts.EVENT_IS_IMPORTANT_COLUMN)));
        event.setmIsClocked(cursor.getInt(cursor.getColumnIndexOrThrow(ColumnContacts.EVENT_IS_CLOCKED)));
        return event;
    }
}
