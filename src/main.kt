import src
fun main(args: Array<String>) {
    val greenflag = false
    Button(onClick ={greenflag = !greenflag}){
        icon("greenflag.png")
    }
    Animations()
    Movement()
    Interactions()
    Transitions()
}