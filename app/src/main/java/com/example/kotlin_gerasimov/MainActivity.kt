package com.example.kotlin_gerasimov


import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {


    private var text: String = "V magazine <ostalos> 10 <banok> cola a mojet and bolshe"
    private var tvText: TextView? = null;
    private var tvText2: TextView? = null;

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // otobrojenie nujnogo sloya
        tvText = findViewById(R.id.tvTextView) // svazali peremennuy and component
        tvText = findViewById(R.id.tvTextView2) // svazali peremennuy and component

        //otobrazit soderjimoe peremennoy tvText on component tvTextView
        var subText: String = text.substringAfter('<')
        var subText2: String = subText.substringBefore('>')
        var subText: String = text.substringAfter('<')
        var subText2: String = subText.substringBefore('>')

        tvText?.setText(subText)
        tvText?.setText(subText2)
        tvText2?.setText(subText)
        tvText2?.setText(subText2)




    }
}

