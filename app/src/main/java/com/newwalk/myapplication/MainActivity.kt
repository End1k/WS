package com.newwalk.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun banks(v: View)
    {
        var next: Intent = Intent(this, BanksActivity::class.java)
        startActivity(next)
    }
    fun courses(v: View)
    {
        var next: Intent = Intent(this, CoursesActivity::class.java)
        startActivity(next)
    }
    fun login(v: View)
    {
        var next: Intent = Intent(this, LoginActivity::class.java)
        startActivity(next)
    }
}
