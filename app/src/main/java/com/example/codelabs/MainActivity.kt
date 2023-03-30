package com.example.codelabs

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.codelabs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        clickBtnIngresar()
        clickBtnRegistro()
        clickBtnInvitado()

    }

    fun clickBtnIngresar() {
        binding.btnIngresar.setOnClickListener() {
            val ventanaIngreso = Intent(applicationContext, ActivityIngreso::class.java)
            startActivity(ventanaIngreso)

        }
    }

    fun clickBtnRegistro() {
        binding.btnRegistrar.setOnClickListener() {
            val ventanaRegistro = Intent(applicationContext, ActivityRegistro::class.java)
            startActivity(ventanaRegistro)

        }
    }

    fun clickBtnInvitado() {
        binding.btnInvitado.setOnClickListener() {
            val ventanaInvitado = Intent(applicationContext, ActivityInvitado::class.java)
            startActivity(ventanaInvitado)


        }
    }
}