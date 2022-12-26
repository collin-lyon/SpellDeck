package com.example.spelldeck

import android.util.Log
import com.google.gson.Gson

class Spells {
    private val s: MutableList<Spell> = mutableListOf()
    fun load() {
        var json = Gson().toJson(s)
        Log.d("TODO", json)

    }

    fun save() {
        Log.d("TEST", "I AM SAVING!")
    }

    fun addSpell(name: String, level: Int, school: String, cast: String, dur: String, con: Boolean, range: String) {
        s.add(Spell( name, level, school, cast, dur, con, range))
    }
}