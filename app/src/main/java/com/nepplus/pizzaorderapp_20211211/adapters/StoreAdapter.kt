package com.nepplus.pizzaorderapp_20211211.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.nepplus.pizzaorderapp_20211211.R
import com.nepplus.pizzaorderapp_20211211.datas.StoreData

class StoreAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StoreData>
) : ArrayAdapter<StoreData>( mContext,resId,mList ) {

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {

            tempRow = mInflater.inflate( R.layout.store_list_item, null )

        }

        val row = tempRow!!

        val data = mList[ position ]

        val imgLogo = row.findViewById<ImageView>(R.id.imgLogo)
        val txtStoreName = row.findViewById<TextView>(R.id.txtStoreName)

        txtStoreName.text = data.name

        Glide.with(mContext).load(data.logoURL).into(imgLogo)

        return row

    }

}