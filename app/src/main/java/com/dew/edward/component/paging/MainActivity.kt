package com.dew.edward.component.paging

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.dew.edward.component.paging.controller.SearchVideoActivity
import com.example.android.codelabs.paging.R
import com.example.android.codelabs.paging.ui.SearchRepositoriesActivity

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when (item?.itemId){
            R.id.menu_github -> {
                startActivity(Intent(this, SearchRepositoriesActivity::class.java))
            }

            R.id.menu_youtube -> startActivity(Intent(this, SearchVideoActivity::class.java))
        }

        return super.onOptionsItemSelected(item)
    }
}
