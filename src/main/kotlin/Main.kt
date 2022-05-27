class WatherStation {
}

fun main(){

    val weatherData = WeatherData()
    val currentConditionDisplay = CurrentConditionDisplay(weatherData)

    weatherData.setMeasurements(2.3F, 33.2F, 53.1F)
    weatherData.setMeasurements(7.3F, 7.2F, 7.1F)
    weatherData.setMeasurements(12.3F, 12.2F, 12.1F)


}
