package com.tuusuario.ecosistemamovil

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.LinearLayout
import android.widget.ScrollView
import android.graphics.Color
import android.view.Gravity
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    companion object {
        private const val TAG = "EcosistemaMovil"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(TAG, "onCreate: Actividad creada exitosamente")

        val scrollView = ScrollView(this)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(48, 48, 48, 48)
        }

        layout.addView(createTitle("Ecosistema Móvil"))
        layout.addView(createSubtitle("Paradigmas de Desarrollo"))

        val paradigmas = listOf(
            Triple(
                "Nativo",
                "Kotlin / Swift",
                "Rendimiento máximo y acceso completo a las APIs del sistema."
            ),
            Triple(
                "Híbrido",
                "Ionic / Capacitor",
                "Tecnologías web ejecutadas dentro de un contenedor nativo."
            ),
            Triple(
                "Multiplataforma",
                "Flutter / React Native",
                "Código compartido con rendimiento cercano al nativo."
            )
        )

        paradigmas.forEachIndexed { index, (nombre, tech, desc) ->
            Log.i(TAG, "Mostrando paradigma ${index + 1}: $nombre")
            layout.addView(createCard(nombre, tech, desc))
        }

        scrollView.addView(layout)
        setContentView(scrollView)
    }

    private fun createTitle(text: String): TextView =
        TextView(this).apply {
            this.text = text
            textSize = 28f
            setTextColor(Color.parseColor("#065A82"))
            gravity = Gravity.CENTER
            setPadding(0, 0, 0, 16)
        }

    private fun createSubtitle(text: String): TextView =
        TextView(this).apply {
            this.text = text
            textSize = 18f
            setTextColor(Color.parseColor("#666666"))
            gravity = Gravity.CENTER
            setPadding(0, 0, 0, 32)
        }

    private fun createCard(
        title: String,
        tech: String,
        desc: String
    ): LinearLayout =
        LinearLayout(this).apply {

            orientation = LinearLayout.VERTICAL
            setPadding(32, 24, 32, 24)

            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(0, 16, 0, 16)
            }

            setBackgroundColor(Color.parseColor("#E8F4F8"))

            addView(TextView(context).apply {
                text = title
                textSize = 20f
                setTextColor(Color.parseColor("#065A82"))
            })

            addView(TextView(context).apply {
                text = "Tecnología: $tech"
                textSize = 14f
                setTextColor(Color.parseColor("#1C7293"))
            })

            addView(TextView(context).apply {
                text = desc
                textSize = 14f
                setPadding(0, 8, 0, 0)
            })
        }
}