package sg.toru.kotlinstudy.ui

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sg.toru.kotlinstudy.R
import sg.toru.kotlinstudy.databinding.ActivityMainBinding
import sg.toru.kotlinstudy.usecase.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var delegate:BaseDelegate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRoleA.setOnClickListener {
            initDelegate("a")
            ViewModelDelegate(delegate).doSomething()
        }

        binding.btnRoleB.setOnClickListener {
            initDelegate("b")
            ViewModelDelegate(delegate).doSomething()
        }

        binding.btnRoleC.setOnClickListener {
            initDelegate("c")
            ViewModelDelegate(delegate).doSomething()
        }
    }

    private fun initDelegate(type:String) {
        delegate = when (type) {
            "a" -> ADelegate()
            "b" -> BDelegate()
            else -> CDelegate()
        }
    }
}
