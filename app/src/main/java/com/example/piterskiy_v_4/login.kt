import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.piterskiy_v_4.R
import com.example.piterskiy_v_4.personal_area

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.button)

        loginButton.setOnClickListener {
            val intent = Intent(this, personal_area::class.java)
            startActivity(intent)
        }
    }
}
