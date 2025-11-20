// we use sealed class if we know how many subclass will be required.

fun main() {
    var loading = Result.Loading() // sealed class is by default protected so we can not create object of sealed class
    var success = Success()
    var failure = Failure()

    stateCheck(loading)
    stateCheck(success)
    stateCheck(failure)
}

fun stateCheck(state:Result){
    when(state){
        is Failure -> println("State is Failure")
        is Result.Loading -> println("State is Loading")
        is Success -> println("State is Success")
    }
}

sealed class Result{
    class Loading:Result()
}
class Success:Result()
class Failure:Result()