interface Subject {

    fun registerObserver(o: Observer)

    fun removeObsrever(o: Observer)

    fun notifyObservers()

}