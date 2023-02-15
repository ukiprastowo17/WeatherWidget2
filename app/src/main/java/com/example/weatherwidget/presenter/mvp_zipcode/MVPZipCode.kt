package com.example.weatherwidget.presenter.mvp_zipcode

import com.example.weatherwidget.model.remote.data_weather.WeatherResponse
import com.example.weatherwidget.model.remote.data_zipcode.ZipcodeResponse

interface MVPZipCode {
    interface ZipcodePresenter{
        fun getZipcodeData(zipCode: String, countryCode: String)
    }
    interface ZipcodeView{
        fun setResult(zipcodeResponse: ZipcodeResponse)
        fun onLoad(isLoading: Boolean)
        fun showError(message: String)
    }
}