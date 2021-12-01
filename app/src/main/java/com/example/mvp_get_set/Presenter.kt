package com.example.mvp_get_set

class Presenter(val view: View) {

    var model = Model()

    fun textViewToModel() {
        model.SetText(view.getText())
    }

    fun textModelToPresenter() {
        view.setText(model.GetText())
    }
}