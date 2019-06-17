package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        bu_getMyAge.setOnClickListener{
//            //Fire when button is clicked
//            val yearOfBirth:Int = inputDOB.text.toString().toInt()
//            var currYear = Calendar.getInstance().get(Calendar.YEAR)
//            var myAge = currYear - yearOfBirth
//            outputAge.text = getString(R.string.yourAge, myAge.toString())
//        }
    }

    fun buFindMyAge(view:View){
        //Fire when button is clicked
        val currYear = Calendar.getInstance().get(Calendar.YEAR)
        val yearOfBirth:Int = inputDOB.text.toString().toInt()
        if (yearOfBirth == 0) {
            outputAge.text = getString(R.string.invalid_entry)
            return
        }
        else if (yearOfBirth > currYear){
            outputAge.text = getString(R.string.invalid_entry)
            return
        }

        var myAge = currYear - yearOfBirth
        outputAge.text = getString(R.string.yourAge, myAge.toString())
    }
}
