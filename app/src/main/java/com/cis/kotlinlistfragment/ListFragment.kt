package com.cis.kotlinlistfragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.ListFragment

/**
 * A simple [Fragment] subclass.
 */
class ListFragment : ListFragment() {
    var tv: TextView? = null
    var list = arrayOf("항목1", "항목2", "항목3", "항목4", "항목5", "항목6", "항목7", "항목1", "항목2", "항목3", "항목4", "항목5", "항목6", "항목7")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        tv = view.findViewById(R.id.tv)

        val adapter = ArrayAdapter<String>(requireActivity(), android.R.layout.simple_list_item_1, list)

        listAdapter = adapter

        return view
    }

    override fun onListItemClick(l: ListView, v: View, position: Int, id: Long) {
        super.onListItemClick(l, v, position, id)

        var str = list[position]

        tv?.text = str
    }
}
