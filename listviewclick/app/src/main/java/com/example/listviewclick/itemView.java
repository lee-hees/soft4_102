package com.example.listviewclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class itemView extends LinearLayout {

    TextView textView;
    Button button;

    public itemView (Context context) {
        super(context);
        init(context);
    }

    public itemView(Context context, @Nullable AttributeSet attrs){
        super(context, attrs);
    }

    private void init(Context context){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        inflater.inflate(R.layout.item,this,true);

        textView = findViewById(R.id.text1);
        button = findViewById(R.id.btn);

    }

    public void setBtn(String btn){
        button.setText(btn);
    }

    public void setText1(String text1){
        textView.setText(text1);
    }


}
