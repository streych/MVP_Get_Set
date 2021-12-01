package com.example.mvp_get_set

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvp_get_set.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View {
    private var binding: ActivityMainBinding? = null

    val presenter = Presenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        presenter.textModelToPresenter()//получаем первое значение из model

        binding?.btn?.setOnClickListener {
            presenter.textViewToModel() //говорим presenter что надо изменить данные в модели,
            // новые данные из в getText
            presenter.textModelToPresenter()//говорим presenter, а покажи нам эти новые данные
        }
    }

    override fun setText(text: Int) {
        binding?.text?.text = text.toString()
    }

    override fun getText(): Int {
        return 2
    }


}