import kotlin.properties.Delegates

class WeatherData : Subject{
    private var observers = mutableListOf<Observer>()

    private var temperature: Float = 0F
    private var pressure: Float = 0F
    private var humidity: Float = 0F


    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObsrever(o: Observer) {
        observers.remove(o)
    }

    override fun notifyObservers() {
        for (observer in observers){
            observer.update(temperature, humidity, pressure)
        }
    }

    fun measurmentsChanged(){
        notifyObservers()
    }

    fun setMeasurements(temperatureParam: Float, humidityParam: Float, pressureParam: Float){
        temperature = temperatureParam
        humidity = humidityParam
        pressure = pressureParam
        measurmentsChanged()
    }

}