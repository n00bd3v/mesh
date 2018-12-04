package com.mesh.mesh

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bottom_nav.*

class ActivityBottomNav : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                currentFragBackground.setImageResource(R.drawable.backgrounds_maps)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                currentFragBackground.setImageResource(R.drawable.background_groups)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                currentFragBackground.setImageResource(R.drawable.background_messages)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_nav)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        ivSettings.setOnClickListener {
            val intent = Intent(this@ActivityBottomNav, ActivityMySettings::class.java)
            startActivity(intent)
        }

        ivProfilePic.setOnClickListener {
            val intent = Intent(this@ActivityBottomNav, ActivityProfile::class.java)
            startActivity(intent)
        }

        ivLogoButton.setOnClickListener {
            val intent = Intent(this@ActivityBottomNav, ActivityProfile::class.java)
            startActivity(intent)
        }
    }
}
