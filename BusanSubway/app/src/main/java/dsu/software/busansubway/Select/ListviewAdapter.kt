//package dsu.software.busansubway.Select
//
//import android.annotation.SuppressLint
//import android.content.Context
//import android.view.View
//import android.view.ViewGroup
//import android.widget.BaseAdapter
//import android.widget.TextView
//import dsu.software.busansubway.R
//import java.util.*
//
//@Suppress("NAME_SHADOWING")
//class ListviewAdapter(var context: Context?, var list_itemArrayList: ArrayList<ListViewItem>) : BaseAdapter() {
//    var viewholder: ViewHolder? = null
//    override fun getCount(): Int {
//        return list_itemArrayList.size
//    }
//
//    override fun getItem(position: Int): Any {
//        return list_itemArrayList[position]
//    }
//
//    override fun getItemId(position: Int): Long {
//        return position.toLong()
//    }
//
//    @SuppressLint("InflateParams")
//    override fun getView(position: Int, convertView: View, parent: ViewGroup): View {
//        val convertView = convertView
//        viewholder = convertView.tag as ViewHolder
//        if (list_itemArrayList[position].content.backcolor == 1) {
//            viewholder!!.content_textView1!!.setBackgroundResource(R.drawable.button_11)
//        } else if (list_itemArrayList[position].content.backcolor == 2) {
//            viewholder!!.content_textView1!!.setBackgroundResource(R.drawable.button_22)
//        } else if (list_itemArrayList[position].content.backcolor == 3) {
//            viewholder!!.content_textView1!!.setBackgroundResource(R.drawable.button_33)
//        } else if (list_itemArrayList[position].content.backcolor == 4) {
//            viewholder!!.content_textView1!!.setBackgroundResource(R.drawable.button_44)
//        } else if (list_itemArrayList[position].content.backcolor == 5) {
//            viewholder!!.content_textView1!!.setBackgroundResource(R.drawable.button_dd)
//        } else if (list_itemArrayList[position].content.backcolor == 6) {
//            viewholder!!.content_textView1!!.setBackgroundResource(R.drawable.button_kk)
//        }
//
//        //1호선
//        if (list_itemArrayList[position].content.backcolor == 1) {
//            viewholder!!.content_textView1!!.setBackgroundResource(R.drawable.button_11)
//            viewholder!!.content_textView1!!.scaleX = 0.7.toFloat()
//            viewholder!!.content_textView1!!.scaleY = 0.7.toFloat()
//        } else if (list_itemArrayList[position].content.backcolor == 11) {
//            viewholder!!.content_textView1!!.setBackgroundResource(R.drawable.button_11s)
//            viewholder!!.content_textView1!!.scaleX = 1.0.toFloat()
//            viewholder!!.content_textView1!!.scaleY = 1.0.toFloat()
//        }
//        //2호선
//        if (list_itemArrayList[position].content.backcolor == 2) {
//            viewholder!!.content_textView1!!.setBackgroundResource(R.drawable.button_22)
//            viewholder!!.content_textView1!!.scaleX = 0.7.toFloat()
//            viewholder!!.content_textView1!!.scaleY = 0.7.toFloat()
//        } else if (list_itemArrayList[position].content.backcolor == 22) {
//            viewholder!!.content_textView1!!.setBackgroundResource(R.drawable.button_22s)
//            viewholder!!.content_textView1!!.scaleX = 1.0.toFloat()
//            viewholder!!.content_textView1!!.scaleY = 1.0.toFloat()
//        }
//        //3호선
//        if (list_itemArrayList[position].content.backcolor == 3) {
//            viewholder!!.content_textView1!!.setBackgroundResource(R.drawable.button_33)
//            viewholder!!.content_textView1!!.scaleX = 0.7.toFloat()
//            viewholder!!.content_textView1!!.scaleY = 0.7.toFloat()
//        } else if (list_itemArrayList[position].content.backcolor == 33) {
//            viewholder!!.content_textView1!!.setBackgroundResource(R.drawable.button_33s)
//            viewholder!!.content_textView1!!.scaleX = 1.0.toFloat()
//            viewholder!!.content_textView1!!.scaleY = 1.0.toFloat()
//        }
//        //4호선
//        if (list_itemArrayList[position].content.backcolor == 4) {
//            viewholder!!.content_textView1!!.setBackgroundResource(R.drawable.button_44)
//            viewholder!!.content_textView1!!.scaleX = 0.7.toFloat()
//            viewholder!!.content_textView1!!.scaleY = 0.7.toFloat()
//        } else if (list_itemArrayList[position].content.backcolor == 44) {
//            viewholder!!.content_textView1!!.setBackgroundResource(R.drawable.button_44s)
//            viewholder!!.content_textView1!!.scaleX = 1.0.toFloat()
//            viewholder!!.content_textView1!!.scaleY = 1.0.toFloat()
//        }
//        //동해선
//        if (list_itemArrayList[position].content.backcolor == 5) {
//            viewholder!!.content_textView1!!.setBackgroundResource(R.drawable.button_dd)
//            viewholder!!.content_textView1!!.scaleX = 0.7.toFloat()
//            viewholder!!.content_textView1!!.scaleY = 0.7.toFloat()
//        } else if (list_itemArrayList[position].content.backcolor == 55) {
//            viewholder!!.content_textView1!!.setBackgroundResource(R.drawable.button_dds)
//            viewholder!!.content_textView1!!.scaleX = 1.0.toFloat()
//            viewholder!!.content_textView1!!.scaleY = 1.0.toFloat()
//        }
//        //김해선
//        if (list_itemArrayList[position].content.backcolor == 6) {
//            viewholder!!.content_textView1!!.setBackgroundResource(R.drawable.button_kk)
//            viewholder!!.content_textView1!!.scaleX = 0.7.toFloat()
//            viewholder!!.content_textView1!!.scaleY = 0.7.toFloat()
//        } else if (list_itemArrayList[position].content.backcolor == 66) {
//            viewholder!!.content_textView1!!.setBackgroundResource(R.drawable.button_kks)
//            viewholder!!.content_textView1!!.scaleX = 1.0.toFloat()
//            viewholder!!.content_textView1!!.scaleY = 1.0.toFloat()
//        }
//        viewholder!!.content_textView2!!.setText(list_itemArrayList[position].content.contents)
//        return convertView
//    }
//
//    class ViewHolder {
//        var content_textView1: TextView? = null
//        var content_textView2: TextView? = null
//    }
//}
