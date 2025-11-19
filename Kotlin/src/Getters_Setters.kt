fun main() {
    var voter = Voter()
    voter.ageToVote = 16 // setter method invoke
    println(voter.ageToVote) // getter method invoke
    print(voter.nameOfvoter) // getter method invoke
}
class Voter(){
    var ageToVote: Int = 18
//        get() = field
        // setter
        set(value) {
            if(value<18){
                println("Age to vote can not be lesser than 18")
            }
            else{
            field = value
            }
        }
    // getter
    var nameOfvoter: String = "KotlinDeveloper"
        get() {
            return "$field is eligible to vote"
        }
}