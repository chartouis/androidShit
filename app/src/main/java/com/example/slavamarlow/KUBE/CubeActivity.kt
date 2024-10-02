package com.example.slavamarlow.KUBE

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import com.example.slavamarlow.R

class CubeActivity : ComponentActivity() {
    val KUBIK : Kube = Kube()
    var cubeRef = KUBIK.cube
    var faceTemp : String = ""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cube)

        val button = findViewById<Button>(R.id.button_test)
        button.setOnClickListener {

            val fs = findViewById<ImageView>(R.id.white1)
            fs.setImageResource(R.drawable.red)

            setContentView(R.layout.main_layout)
        }


        enableEdgeToEdge()
    }




//    @SuppressLint("DiscouragedApi")
//    private fun drawCube(){
//
//        for (i in 1..4){
//            when(i) {
//                1 -> faceTemp="blue"
//                2 -> faceTemp="blue"
//            }
//
//            for (j in 1..9){
//                faceTemp += j
//                var s = resources.getIdentifier(faceTemp,"drawable", packageName)
//                var tile = findViewById<ImageView>(s)
//                tile.setImageResource(R.drawable.yellow)
//
//                faceTemp = faceTemp.removeRange(faceTemp.lastIndex,faceTemp.lastIndex+1)
//            }
//        }
//    }
}