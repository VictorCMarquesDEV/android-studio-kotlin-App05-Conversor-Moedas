package com.example.app05

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.app05.databinding.ActivityMainBinding
import com.example.app05.ui.theme.App05Theme

// App 05: Converter Moedas usando o LinearLayout

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonReal.setOnClickListener {
            escreverReal(5.4)
        }

        binding.buttonDolar.setOnClickListener {
            escreverDolar(1.1)
        }

        binding.buttonPeso.setOnClickListener {
            escreverPeso(926.88)
        }

    }

    private fun escreverReal(taxa: Double){
        val euros = binding.editEuros.text.toString().trim()

        if(!euros.isEmpty()){
            var resultado = euros.toDouble() * taxa
            binding.textReais.text = String.format("R$ %.2f", resultado)
        } else {
            binding.textReais.text = String.format("Valor não inserido")
        }
    }
    private fun escreverDolar(taxa: Double){
        val euros = binding.editEuros.text.toString().trim()

        if(!euros.isEmpty()){
            var resultado = euros.toDouble() * taxa
            binding.textDolar.text = String.format("US$ %.2f", resultado)
        } else {
            binding.textDolar.text = String.format("Valor não inserido")
        }
    }
    private fun escreverPeso(taxa: Double){
        val euros = binding.editEuros.text.toString().trim()

        if(!euros.isEmpty()){
            var resultado = euros.toDouble() * taxa
            binding.textPeso.text = String.format("$ %.2f", resultado)
        } else {
            binding.textPeso.text = String.format("Valor não inserido")
        }
    }
}