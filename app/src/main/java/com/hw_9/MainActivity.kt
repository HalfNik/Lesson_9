package com.hw_9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

private var <E> List<E>.text: E
    get() {}
    set() {}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv_List = listOf("Привет!","Hallo!", "Hello!","Guten Tag!")
        tv_List.text = tv_List.random()

        btn_counter.setOnClickListener {
        tv_List.text = tv_List.random()

        }
    }
}