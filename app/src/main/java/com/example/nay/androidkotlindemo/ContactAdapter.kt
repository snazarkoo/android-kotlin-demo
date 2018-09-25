import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.nay.androidkotlindemo.ContactInfo
import com.example.nay.androidkotlindemo.R

class ContactAdapter(private val contactList: List<ContactInfo>) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    class ContactViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var vName: TextView
        var vSurname: TextView
        var vEmail: TextView
        var vTitle: TextView

        init {
            vName = v.findViewById<View>(R.id.txtName) as TextView
            vSurname = v.findViewById<View>(R.id.txtSurname) as TextView
            vEmail = v.findViewById<View>(R.id.txtEmail) as TextView
            vTitle = v.findViewById<View>(R.id.title) as TextView
        }
    }


    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(contactViewHolder: ContactViewHolder, i: Int) {
        val ci = contactList[i]
        contactViewHolder.vName.setText(ci.name)
        contactViewHolder.vSurname.setText(ci.surname)
        contactViewHolder.vEmail.setText(ci.email)
        contactViewHolder.vTitle.setText(ci.name + " " + ci.surname)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ContactViewHolder {
        val itemView = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup, false)

        return ContactViewHolder(itemView)
    }
}