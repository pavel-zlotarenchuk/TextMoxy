package com.md.testmoxy

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter

@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {

    fun testMoxy(text: String) {
        viewState.setText("MOXY $text MOXY")
    }
}