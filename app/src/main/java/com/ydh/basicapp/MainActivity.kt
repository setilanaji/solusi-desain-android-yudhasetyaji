package com.ydh.basicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var input: EditText
    lateinit var result: TextView
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        input = findViewById(R.id.editTextName)
        result = findViewById(R.id.textViewResult)
        button = findViewById(R.id.buttonCheck)
        button.setOnClickListener() {
            if(isPalindrome(input.text.toString())){
                result.text = "Palindrome"
            }else{
                result.text = "Bukan Palindrome"
            }
        }
    }

    private fun isPalindrome(text: String): Boolean {
        val newText = text.toCharArray().filter { it.isLetterOrDigit() }.joinToString(" ")
        println(newText)
        val textReverse = newText.toString().reversed()
        println(textReverse)
        if (newText.toString().equals( textReverse.toString(), ignoreCase = true)){
            return true
        }
        return false
    }
}