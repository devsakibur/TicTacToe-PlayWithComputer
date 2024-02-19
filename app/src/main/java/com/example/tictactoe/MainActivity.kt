package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

private var flag = true
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.button).setOnClickListener {
            reset()
        }



    }

    fun clickBtn(view: View){
        val currentBtn = view as Button


        if (currentBtn.text =="") {

            count++
            if (flag) {
                currentBtn.text = "X"
                flag = false
            } else {
//                currentBtn.text = "O"
//                flag = true


            }

        handler.postDelayed(runnable , 1000)
                winCheck()

        }

    }

    val handler = Handler(Looper.getMainLooper())
    val runnable = object : Runnable{
        override fun run() {
            computerCall()
        }

    }


    private fun computerCall(){

    //    val idList = listOf<String>("btn1" , "btn2" , "btn1" , "btn3" , "btn4" , "btn5" , "btn6" , "btn7", "btn8")

    val a =    findViewById<Button>(R.id.btn1)
    val b =    findViewById<Button>(R.id.btn2)
    val c =    findViewById<Button>(R.id.btn3)
    val d =    findViewById<Button>(R.id.btn4)
    val e =    findViewById<Button>(R.id.btn5)
    val f =    findViewById<Button>(R.id.btn6)
    val g =    findViewById<Button>(R.id.btn7)
    val h =    findViewById<Button>(R.id.btn8)
    val i =    findViewById<Button>(R.id.btn9)

        val idBtn = listOf<Button>(a,b,c,d,e,f,g,h,i,)
        val hudaiId = Random.nextInt(idBtn.size)
        var myId = idBtn[hudaiId]

        while (myId.text != ""){
            val hudai = Random.nextInt(idBtn.size)
            myId = idBtn[hudai]
        }
        myId.text = "O"
        flag = true

    }


    private fun winCheck(){

        val btn1 = findViewById<Button>(R.id.btn1).text.toString()
        val btn2 = findViewById<Button>(R.id.btn2).text.toString()
        val btn3 = findViewById<Button>(R.id.btn3).text.toString()
        val btn4 = findViewById<Button>(R.id.btn4).text.toString()
        val btn5 = findViewById<Button>(R.id.btn5).text.toString()
        val btn6 = findViewById<Button>(R.id.btn6).text.toString()
        val btn7 = findViewById<Button>(R.id.btn7).text.toString()
        val btn8 = findViewById<Button>(R.id.btn8).text.toString()
        val btn9 = findViewById<Button>(R.id.btn9).text.toString()

        if (btn1 == btn2 && btn2 == btn3 && btn3 != ""){
            findViewById<TextView>(R.id.resView).text = "Winner is $btn1"
        findViewById<Button>(R.id.button).visibility= View.VISIBLE


        }else  if (btn4 == btn5 && btn5 == btn6  && btn6 != ""){
            findViewById<TextView>(R.id.resView).text = "Winner is $btn4"
        findViewById<Button>(R.id.button).visibility= View.VISIBLE


        }else  if (btn7 == btn8 && btn8 == btn9 && btn7 != ""){
            findViewById<TextView>(R.id.resView).text = "Winner is $btn7"
        findViewById<Button>(R.id.button).visibility= View.VISIBLE


        }else  if (btn1 == btn4 && btn4 == btn7 && btn1 != ""){
            findViewById<TextView>(R.id.resView).text = "Winner is $btn1"
        findViewById<Button>(R.id.button).visibility= View.VISIBLE


        }else  if (btn2 == btn5 && btn5 == btn8 && btn2 != ""){
            findViewById<TextView>(R.id.resView).text = "Winner is $btn2"
        findViewById<Button>(R.id.button).visibility= View.VISIBLE


        }else  if (btn3 == btn6 && btn6 == btn9 && btn3 != ""){
            findViewById<TextView>(R.id.resView).text = "Winner is $btn3"
        findViewById<Button>(R.id.button).visibility= View.VISIBLE


        }else  if (btn1 == btn5 && btn5 == btn9 && btn1 != ""){
            findViewById<TextView>(R.id.resView).text = "Winner is $btn1"
        findViewById<Button>(R.id.button).visibility= View.VISIBLE


        }else  if (btn3 == btn5 && btn5 == btn7 && btn3 != ""){
            findViewById<TextView>(R.id.resView).text = "Winner is $btn1"
        findViewById<Button>(R.id.button).visibility= View.VISIBLE


        }else if (count == 9){
            findViewById<TextView>(R.id.resView).text = "Draw"
        findViewById<Button>(R.id.button).visibility= View.VISIBLE



        }

    }

    private fun reset() {

        findViewById<Button>(R.id.btn1).text = ""
        findViewById<Button>(R.id.btn2).text = ""
        findViewById<Button>(R.id.btn3).text = ""
        findViewById<Button>(R.id.btn4).text = ""
        findViewById<Button>(R.id.btn5).text = ""
        findViewById<Button>(R.id.btn6).text = ""
        findViewById<Button>(R.id.btn7).text = ""
        findViewById<Button>(R.id.btn8).text = ""
        findViewById<Button>(R.id.btn9).text = ""
        findViewById<Button>(R.id.button).visibility= View.GONE
        findViewById<TextView>(R.id.resView).text = ""

    }








}