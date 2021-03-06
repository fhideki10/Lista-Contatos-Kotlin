package com.ecs5.nacfiap

import android.widget.ArrayAdapter
import android.widget.ListView
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.cadastro_view.*

class MainActivity : AppCompatActivity() {

    var array = arrayOf("João Carlos", "Marcelo Santos", "Camila Buarque", "Sarah Yazaki", "Larissa", "Otamir", "Gilberto dos Reis", "Fábio", "Henrique");

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()*/
            setContentView(R.layout.cadastro_view)

            btnVoltar.setOnClickListener{
                setContentView(R.layout.activity_main)

                val adapter = ArrayAdapter(this,
                    R.layout.listview_item , array);

                val listView:ListView = findViewById(R.id.lstContatos)
                listView.setAdapter(adapter)
            }
        }

        val adapter = ArrayAdapter(this,
            R.layout.listview_item , array);

        val listView:ListView = findViewById(R.id.lstContatos)
        listView.setAdapter(adapter)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when(item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
