package com.mesh.mesh

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_my_settings.*
import kotlinx.android.synthetic.main.content_activity_my_settings.*

class ActivityMySettings : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_settings)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        tvSettingsSignOut.setOnClickListener {
            val intent = Intent(this@ActivityMySettings, ActivityLogin::class.java)
            startActivity(intent)
        }
    }

}
