package com.dilip.week6assignment1.ui

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.dilip.week6assignment1.R
import com.dilip.week6assignment1.model.Student

class StudentDetails : AppCompatActivity() {
    val lstUser = arrayListOf<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_details)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
//        val appBarConfiguration = AppBarConfiguration(
//            setOf(
//                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
//            )
//        )
//        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        loadUsers()
    }
    private fun loadUsers(){
        lstUser.add(Student("Kiran Rana", 30, "Male", "Satdobato",
                "https://avatars3.githubusercontent.com/u/17020882?s=400&u=59482bbaa74bd232941350394cf3bb9f59c4abbd&v=4"))
        lstUser.add(Student("Salman Khan", 56, "Male", "Mumba",
        "https://english.cdn.zeenews.com/sites/default/files/2019/06/24/798316-salman-socialmeida.jpg"))
        lstUser.add(Student("Katrina Kaif", 32, "Female", "Bandra",
                "https://upload.wikimedia.org/wikipedia/commons/8/8b/Katrina_Kaif_promoting_Bharat_in_2019.jpg"))
    }
}