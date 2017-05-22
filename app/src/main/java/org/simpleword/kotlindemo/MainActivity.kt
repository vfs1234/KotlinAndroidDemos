package org.simpleword.kotlindemo

import android.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_hello.setText("kot linx lololol")
        var builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setMessage("lolol")
                .show()


    }
}
