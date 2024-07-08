import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputBinding
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.akirachix.enwallet.R
import com.akirachix.enwallet.databinding.BalanceListLayoutBinding


class AdapterBalance (val balance: List<Balance>):RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val binding=BalanceListLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactsViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return balance.size
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val contact= balance[position]
        holder.binding.tvName.text= contact.name
        holder.binding.tvPhoneNumber.text= contact.phoneNumber
        holder.binding.tvEmail.text= contact.email

    }
}
class  ContactsViewHolder(val binding:BalanceListLayoutBinding):RecyclerView.ViewHolder(binding.root){
//    val tvName = itemView.findViewById<TextView>(R.id.tvName)
//    val tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
//    var tvPhoneNumber = itemView.findViewById<TextView>(R.id.tvPhoneNumber)
}