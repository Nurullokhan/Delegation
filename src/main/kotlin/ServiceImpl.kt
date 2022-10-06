class ServiceImpl(var value: Int) : Service {
    override fun display() {
        println(value)
    }
}