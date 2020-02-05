package com.newwalk.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_banks.view.*

//class BankInfoAdapter: RecyclerView.Adapter<BankInfoAdapter.BankInfoViewHolder> {
//
//    class BankInfoViewHolder : RecyclerView.ViewHolder
//    {
//        public BankInfoViewHolder() {
//            //super(itemView);
//            //var nameTextView = itemView.findViewById(R.id.movie_item__tv_name);
//            //var descriptionTextView = itemView.findViewById(R.id.movie_item__tv_description);
//            var adress: TextView  = findViewById(R.id.adress);
//        }
//    }
//
//}

    class BankInfoAdapter(list : List<BankInfo>) : RecyclerView.Adapter<BankViewHolder>() {
        var listt = list
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BankViewHolder {
            var v = LayoutInflater.from(parent.context).inflate(R.layout.bank_note, parent, false)
            return BankViewHolder(v)
        }

        override fun getItemCount(): Int {
            return listt.size
        }

        override fun onBindViewHolder(holder: BankViewHolder, position: Int) {
            holder.bind(listt[position])
        }
    }

     class BankViewHolder (view: View) : RecyclerView.ViewHolder(view) {
          var adress : TextView = view.findViewById(R.id.adress)
          var type : TextView = view.findViewById(R.id.type)

         fun bind(b : BankInfo){
            adress.text = b.position

         }
    }

    //val items : ArrayList<String>, val context: Context
    // Gets the number of animals in the list

//https://polis-mail-ru.github.io/2019-android/02_views_layouts_recycler/023_recycler_view/