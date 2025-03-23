package aplicacion.quirofano

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class GinecologiaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ginecologia)

        val buttonHisteroscopia: Button = findViewById(R.id.buttonHisteroscopia)
        buttonHisteroscopia.setOnClickListener {
            val intent = Intent(this, HisteroscopiaActivity::class.java)
            startActivity(intent)
        }
    }
}