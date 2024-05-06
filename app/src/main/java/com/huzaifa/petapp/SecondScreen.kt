package com.huzaifa.petapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

//Name: Huzaifa Amod
// Student Number: ST10439051

class GameActivity : AppCompatActivity() {

    // Declaring variables for UI elements
    private lateinit var petImageView: ImageView
    private lateinit var healthEditText: EditText
    private lateinit var hungerEditText: EditText
    private lateinit var cleanlinessEditText: EditText

    // Initializing the values for pet's status
    private var health = 100
    private var hunger = 0
    private var cleanliness = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

        // Initializing the UI elements
        petImageView = findViewById(R.id.petImageView)
        healthEditText = findViewById(R.id.healthEditText)
        cleanlinessEditText = findViewById(R.id.cleanlinessEditText)
        hungerEditText = findViewById(R.id.hungerEditText)

        // Updating the status values
        updateStatus()
    }

    // This is the Function to handle Feed button click
    fun onFeedClicked(view: android.view.View) {
        // This sets the pet image to feeding dog
        petImageView.setImageResource(R.drawable.feedingdog)

        // This Updates health and hunger values based on instructions
        health += 10
        if (health > 100) health = 100
        hunger -= 20
        if (hunger < 0) hunger = 0

        // Updates the displayed status values
        updateStatus()

        // Shows a toast message
        Toast.makeText(this, "Feeding the pet!", Toast.LENGTH_SHORT).show()
    }

    // Function to handle Clean button click
    fun onCleanClicked(view: android.view.View) {
        // Setting the pet image to a cleaning dog
        petImageView.setImageResource(R.drawable.cleaningdog)

        // Updating health and cleanliness values based on instructions
        health += 20
        if (health > 100) health = 100
        cleanliness += 20
        if (cleanliness > 100) cleanliness = 100

        // Updating displayed status values
        updateStatus()

        // Showing a toast message
        Toast.makeText(this, "Cleaning the pet!", Toast.LENGTH_SHORT).show()
    }

    // Function to handle Play button click
    fun onPlayClicked(view: android.view.View) {
        // Setting the pet image to playing dog
        petImageView.setImageResource(R.drawable.playingdog)

        // Updating hunger and cleanliness values based on instructions
        hunger += 20
        if (hunger > 100) hunger = 100
        cleanliness -= 20
        if (cleanliness < 0) cleanliness = 0

        // Updating displayed status values
        updateStatus()

        // Showing a toast message
        Toast.makeText(this, "Playing with the pet!", Toast.LENGTH_SHORT).show()
    }

    // Function to update status values displayed in EditText
    private fun updateStatus() {
        healthEditText.setText("Health: $health%")
        hungerEditText.setText("Hunger: $hunger%")
        cleanlinessEditText.setText("Cleanliness: $cleanliness%")
    }
}


// Refrences:

//GeeksforGeeks 2019. A computer science portal for geeks. [online] GeeksforGeeks. Available at: https://www.geeksforgeeks.org/.[ Accessed 28 April 2024 ]

//GitHub 2008. GitHub. [online] GitHub. Available at: https://github.com/. [ Accessed 28 April 2024]

//www.youtube.com. (no date). Android Studio : How to Add a Background Image to Activity. [online] Available at: https://www.youtube.com/watch?v=7OvsWwbvYsM.[ Accessed 28 April 2024]

//RapidTables 2019. RGB Color Codes Chart. [online] Rapidtables.com. Available at: https://www.rapidtables.com/web/color/RGB_Color.html.[ Accessed 28 April 2024]

//DeepAI 2022. Text To Image. [online] DeepAI. Available at: https://deepai.org/machine-learning-model/text2img.[ Accessed 28 April 2024]

//Stack Overflow 2008. Stack Overflow - Where Developers Learn, Share, & Build Careers. [online] Stack Overflow. Available at: https://stackoverflow.com/.[ Accessed 28 April 2024]

