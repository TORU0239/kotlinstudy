package sg.toru.kotlinstudy.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sg.toru.kotlinstudy.R
import sg.toru.kotlinstudy.usecase.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel:MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initDelegate()
    }

    private fun init() {
        viewModel = MainViewModel(MainUseCaseIml())
        viewModel.getResponse()
    }

    private fun initDelegate() {
        val delegateA = ViewModelDelegate(ADelegate())
        delegateA.doSomething()

        val delegateB = ViewModelDelegate(BDelegate())
        delegateB.doSomething()
    }
}
