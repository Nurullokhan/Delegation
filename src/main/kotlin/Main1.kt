fun main(args: Array<String>) {

    val serviceImpl = ServiceImpl(10)
    val delegationServiceImpl = DelegationServiceImpl(serviceImpl)
    delegationServiceImpl.display()

}