package fr.android.androidexercises

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class BookAdapter(context: Context, private val books: List<Book>) : BaseAdapter() {

    private val inflater = LayoutInflater.from(context);

    override fun getCount(): Int = books.count()

    override fun getItem(position: Int): Book = books[position]

    override fun getItemId(position: Int): Long = getItem(position).hashCode().toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        val view = inflater.inflate(R.layout.custom_view_item_book, parent,  false);
        view.findViewById<TextView>(R.id.nameTextView).text = getItem(position).name;
        view.findViewById<TextView>(R.id.priceTextView).text = getItem(position).price.toString();
        return view;
    }

}
