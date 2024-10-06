package com.example.slavamarlow.KUBE

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.ColorStateList
import android.os.Bundle
import android.provider.CalendarContract.Colors
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import com.example.slavamarlow.MainActivity
import com.example.slavamarlow.R
import com.google.android.material.textfield.TextInputLayout

class CubeActivity : ComponentActivity() {
    val KUBIK : Kube = Kube()
    val whiteFace = arrayOf(R.id.white1, R.id.white2, R.id.white3, R.id.white4, R.id.white5, R.id.white6, R.id.white7, R.id.white8, R.id.white9)
    val greenFace = arrayOf(R.id.green1, R.id.green2, R.id.green3, R.id.green4, R.id.green5, R.id.green6, R.id.green7, R.id.green8, R.id.green9)
    val blueFace = arrayOf(R.id.blue1, R.id.blue2, R.id.blue3, R.id.blue4, R.id.blue5, R.id.blue6, R.id.blue7, R.id.blue8, R.id.blue9)
    val yellowFace = arrayOf(R.id.yellow1, R.id.yellow2, R.id.yellow3, R.id.yellow4, R.id.yellow5, R.id.yellow6, R.id.yellow7, R.id.yellow8, R.id.yellow9)

    var cubeRef = KUBIK.cube




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cube)

        val til = findViewById<EditText>(R.id.commands_text)
        KUBIK.giveCommand("D2")
        val tex = findViewById<TextView>(R.id.textView)

        val button = findViewById<Button>(R.id.button_test)
        button.setOnClickListener {

//            var text = til.text.toString()
//            KUBIK.giveCommand(text)
//            tex.text = text
            drawCube()

        }
        enableEdgeToEdge()
    }







    private  fun drawCube(){
            for (i in 0..8){
                findViewById<ImageView>(whiteFace[i]).setImageResource(cubeRef[4][i/3][i%3])
                findViewById<ImageView>(greenFace[i]).setImageResource(cubeRef[5][i/3][i%3])
                findViewById<ImageView>(blueFace[i]).setImageResource(cubeRef[3][i/3][i%3])
                findViewById<ImageView>(yellowFace[i]).setImageResource(cubeRef[1][i/3][i%3])
            }
        }

    }
