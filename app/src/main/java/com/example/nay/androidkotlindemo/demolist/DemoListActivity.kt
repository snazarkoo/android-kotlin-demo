package com.example.nay.androidkotlindemo.demolist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.nay.androidkotlindemo.R
import kotlinx.android.synthetic.main.activity_demo_list.*

class DemoListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_list)
        cardList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = ContactAdapter(createList(30))
        }
    }

    private fun createList(size: Int): List<ContactInfo> = (0 until size).map { i ->
        ContactInfo().apply {
            name = ContactInfo.NAME_PREFIX + i
            surname = ContactInfo.SURNAME_PREFIX + i
            email = ContactInfo.EMAIL_PREFIX + i + "@test.com"
        }
    }
}
