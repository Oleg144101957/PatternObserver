class CurrentConditionDisplay(watherDataParam: Subject): Observer, DisplayElement {
    private var temperature: Float = 0F
    private var humidity: Float = 0F
    lateinit var watherData: Subject

    init {
        watherData = watherDataParam
        watherData.registerObserver(this)
    }



    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        display()
    }

    override fun display() {
        println("Current conditions: Temp $temperature, Humidity: $humidity")
    }
}