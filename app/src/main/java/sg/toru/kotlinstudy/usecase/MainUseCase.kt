package sg.toru.kotlinstudy.usecase

import android.util.Log

interface MainUseCase {
    fun getResponse()
}

class MainUseCaseIml: MainUseCase {
    override fun getResponse() {
        Log.e("Toru", "getResponse")
    }
}

class MainViewModel(
    private val mainUseCase: MainUseCase
) {
    fun getResponse() {
        mainUseCase.getResponse()
    }
}


interface BaseDelegate {
    fun doSomething()
}

class ADelegate:BaseDelegate{
    override fun doSomething() {
        Log.e("Toru", "do A!")
    }
}

class BDelegate:BaseDelegate{
    override fun doSomething() {
        Log.e("Toru", "do B!")
    }
}

class CDelegate:BaseDelegate{
    override fun doSomething() {
        Log.e("Toru", "do C!")
    }
}

class ViewModelDelegate(
    private val baseDelegate:BaseDelegate
):BaseDelegate by baseDelegate

