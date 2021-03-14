package custodio.juancarlos.facebooklogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRegistrar: Button = findViewById(R.id.btnRegistrar)
        var campoNombre: TextView = findViewById(R.id.nombre)
        var campoApellido: TextView = findViewById(R.id.apellido)
        var campoCorreo: TextView = findViewById(R.id.correo)
        var campoContrasenia: TextView = findViewById(R.id.contrasenia)
        var campoTelefono: TextView = findViewById(R.id.telefono)

        btnRegistrar.setOnClickListener(){
            var nombre: String = campoNombre.text.toString()
            var apellido: String = campoApellido.text.toString()

            val intent: Intent = Intent(this, Bienvenido::class.java)
            intent.putExtra("nombre", nombre)
            intent.putExtra("apellido", apellido)
            startActivity(intent)
        }
    }
}