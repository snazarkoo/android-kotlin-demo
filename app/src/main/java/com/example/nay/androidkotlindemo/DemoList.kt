package com.example.nay.androidkotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import ContactAdapter

class DemoList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_demo_list)

        val recList = findViewById<View>(R.id.cardList) as RecyclerView

        recList.setHasFixedSize(true)

        val llm = LinearLayoutManager(this)

        llm.orientation = LinearLayoutManager.VERTICAL
        recList.layoutManager = llm

        val ca = ContactAdapter(createList(30))
        recList.adapter = ca
    }

    private fun createList(size: Int): List<ContactInfo> {
        val result = ArrayList<ContactInfo>()

        for (i in 1..size) {
            val ci = ContactInfo()
            ci.name = ContactInfo.NAME_PREFIX + i
            ci.surname = ContactInfo.SURNAME_PREFIX + i
            ci.email = ContactInfo.EMAIL_PREFIX + i + "@test.com"

            result.add(ci)
        }

        return result
    }
}
