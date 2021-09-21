package geekbrains.ru.translator.view

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class Example {
   var name: String
   get() = "123"
    set(value) {

    }

    var surname: String = "Surname"
}

class Properties : AppCompatActivity() {

    private val propertyDelegate = PropertyDelegate<Properties>()


//    var name by PropertyDelegate()

    val vm by viewModel<ViewModel>()
}

class PropertyDelegate<T>

fun main() {
    val example = Example()

    example.surname = "321"
}