package com.example.nay.androidkotlindemo.demolist

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nay.androidkotlindemo.R
import kotlinx.android.synthetic.main.card_layout.view.*

class ContactAdapter(private val contactList: List<ContactInfo>) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {
    class ContactViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val vName = view.txtName
        val vSurname = view.txtSurname
        val vEmail = view.txtEmail
        val vTitle = view.title
    }


    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(contactViewHolder: ContactViewHolder, index: Int) {
        val contact = contactList[index]

        contactViewHolder.apply {
            vName.text = contact.name
            vSurname.text = contact.surname
            vEmail.text = contact.email
            vTitle.text = contact.name + " " + contact.surname
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, index: Int): ContactViewHolder {
        val itemView = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup, false)

        return ContactViewHolder(itemView)
    }
}