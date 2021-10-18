package com.example.simplecalculatorbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var et1: EditText
    lateinit var et2: EditText
    lateinit var button: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var button4: Button
    lateinit var textView: TextView
    var num1:Double=0.0
    var num2:Double=0.0
    var result:Double=0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et1=findViewById(R.id.et1)
        et2=findViewById(R.id.et2)
        button=findViewById(R.id.button)
        button2=findViewById(R.id.button2)
        button3=findViewById(R.id.button3)
        button4=findViewById(R.id.button4)
        textView=findViewById(R.id.textView)

        button.setOnClickListener {
           calc(button)
        }

        button2.setOnClickListener {
            calc(button2)
        }

        button3.setOnClickListener {
            calc(button3)
        }

        button4.setOnClickListener {
            calc(button4)
        }
    }

    fun calc(b:Button){
        num1=et1.text.toString().toDouble()
        num2=et2.text.toString().toDouble()
        when(b){
            button->result=num1*num2
            button2->result=num1+num2
            button3->result=num1-num2
            button4->{if (num2!=0.0){result=num1/num2}else{Toast.makeText(this,"you can not divide by 0",Toast.LENGTH_LONG).show()}}
        }
        textView.text=result.toString()
    }

}