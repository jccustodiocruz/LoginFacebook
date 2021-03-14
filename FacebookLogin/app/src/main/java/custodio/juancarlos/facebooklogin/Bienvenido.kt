package custodio.juancarlos.facebooklogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Bienvenido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenido)

        var bundle = intent.extras

        var textBienvenido: TextView = findViewById(R.id.textBienvenido)

        if (bundle != null){
            var nombre = bundle.getString("nombre")
            var apellido = bundle.getString("apellido")

            textBienvenido.setText("$nombre $apellido")
        }


    }
}