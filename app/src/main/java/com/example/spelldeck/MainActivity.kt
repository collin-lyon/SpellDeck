package com.example.spelldeck

import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class App: Application() {
    companion object {
        var gSpells : Spells = Spells()
    }
}

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.toAddSpell).setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.toAddSpell -> {
                startActivity(Intent(this, AddSpell::class.java))
            }
        }
    }
}