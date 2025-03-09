package aplicacion.quirofano

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageButton>(R.id.btnCirugiaGeneral).setOnClickListener {
            startActivity(Intent(this, CirugiaGeneralActivity::class.java))
        }

        findViewById<ImageButton>(R.id.btnCirugiaPlastica).setOnClickListener {
            startActivity(Intent(this, CirugiaPlasticaActivity::class.java))
        }

        findViewById<ImageButton>(R.id.btnTraumatologia).setOnClickListener {
            startActivity(Intent(this, TraumatologiaActivity::class.java))
        }

        findViewById<ImageButton>(R.id.btnVascular).setOnClickListener {
            startActivity(Intent(this, CirugiaVascularActivity::class.java))
        }

        findViewById<ImageButton>(R.id.btnOtorrino).setOnClickListener {
            startActivity(Intent(this, OtorrinoActivity::class.java))
        }

        findViewById<ImageButton>(R.id.btnUrologia).setOnClickListener {
            startActivity(Intent(this, UrologiaActivity::class.java))
        }

        findViewById<ImageButton>(R.id.btnMaxilofacial).setOnClickListener {
            startActivity(Intent(this, MaxilofacialActivity::class.java))
        }

        findViewById<ImageButton>(R.id.btnGinecologia).setOnClickListener {
            startActivity(Intent(this, GinecologiaActivity::class.java))
        }
    }
}