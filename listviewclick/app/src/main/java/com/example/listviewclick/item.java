package com.example.listviewclick;

public class item {
    String btn;
    String text1;


    public item(String btn, String text1){

        this.btn = btn;
        this.text1 = text1;


    }

    public String getBtn(){
        return btn;
    }

    public void setBtn(String btn){
        this.btn = btn;
    }

    public String getText1(){
        return text1;
    }

    public void setText1(String text1){
        this.text1 = text1;
    }


    @Override
    public String toString(){
        return "Item" + btn + text1;
}
}
