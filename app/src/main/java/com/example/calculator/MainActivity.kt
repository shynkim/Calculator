package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var edit1:EditText
    lateinit var edit2:EditText
    lateinit var btnAdd:Button
    lateinit var btnSub:Button
    lateinit var textResult: TextView

    lateinit var num1:String
    lateinit var num2:String
    var result:Int?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title="초간단 계산기"

        edit1=findViewById(R.id.Edit1)
        edit2=findViewById(R.id.Edit2)
        btnAdd=findViewById(R.id.BtnAdd)
        btnSub=findViewById(R.id.BtnSub)
        textResult=findViewById(R.id.TextResult)

        btnAdd.setOnTouchListener { view, motionEvent ->
            num1=edit1.text.toString()
            num2=edit2.text.toString()
            result=Integer.parseInt(num1)+Integer.parseInt(num2)
            textResult.text="계산결과: "+result.toString()
            false
        }
        btnSub.setOnTouchListener { view, motionEvent ->
            num1=edit1.text.toString()
            num2=edit2.text.toString()
            result=Integer.parseInt(num1)-Integer.parseInt(num2)
            textResult.text="계산결과: "+result.toString()
            false
        }
    }
}

