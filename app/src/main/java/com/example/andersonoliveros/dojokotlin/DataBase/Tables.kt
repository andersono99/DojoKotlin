package com.example.andersonoliveros.dojokotlin.DataBase


class Tables {
    // Tables

    abstract  class Notes {
        companion object {
            val _ID = "_id"
            val TABLE_NAME = "notes"
            val COLUMN_TITLE = "title"
            val COLUMN_BODY = "body"
        }
    }
}