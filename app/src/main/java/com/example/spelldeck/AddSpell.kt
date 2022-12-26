package com.example.spelldeck

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.spelldeck.App.Companion.gSpells

class AddSpell : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View) {
        when (v.id) {
            R.id.buttonAddSpell -> {
                addSpell()
                gSpells.load()
            }
        }
    }

    private fun addSpell() {
        gSpells.addSpell(
            spellName.text.toString().trim(),
            spellLevel.text.toString().trim().toInt(),
            spellSchool.text.toString().trim(),
            spellCast.text.toString().trim(),
            spellDur.text.toString().trim(),
            spellCon.isChecked,
            spellRange.text.toString().trim()
        )
    }
    private lateinit var spellName: EditText
    private lateinit var spellLevel: EditText
    private lateinit var spellCast: EditText
    private lateinit var spellDur: EditText
    private lateinit var spellSchool: EditText
    private lateinit var spellRange: EditText
    private lateinit var spellCon: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        gSpells.load()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_spell)

        spellName = findViewById(R.id.textName)
        spellLevel = findViewById(R.id.textLevel)
        spellCast = findViewById(R.id.textCast)
        spellDur = findViewById(R.id.textDur)
        spellSchool = findViewById(R.id.textSchool)
        spellRange = findViewById(R.id.textRange)
        spellCon = findViewById(R.id.checkCon)

        findViewById<Button>(R.id.buttonAddSpell).setOnClickListener(this)
    }
}
