import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class AdapterBalance (val balance: List<Balance>):RecyclerView.Adapter<Balancev>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BalanceViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,  parent, false)
        return ContactsViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return balance.size
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val contact= balance[position]
        holder.tvName.text= contact.name
        holder.tvPhoneNumber.text= contact.phoneNUmber
        holder.tvEmail.text= contact.email

    }
}
class  ContactsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    val tvName = itemView.findViewById<TextView>(R.id.tvName)
    val tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
    var tvPhoneNumber = itemView.findViewById<TextView>(R.id.tvPhoneNumber)
}