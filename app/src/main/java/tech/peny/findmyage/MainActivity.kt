package tech.peny.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CalendarView
import android.widget.EditText
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnGetAge = findViewById<Button>(R.id.btnGetAge)
        var textView = findViewById<TextView>(R.id.textView)
        var editText = findViewById<EditText>(R.id.editText)

        btnGetAge.setOnClickListener{
            val userDOB:Int = Integer.parseInt(editText.text.toString())
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val userAgeInYears = currentYear - userDOB;

            textView.text = "Your age is $userAgeInYears years"
            Log.d("Logs me","Your age is $userAgeInYears years")
        }
    }
}