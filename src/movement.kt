import src
fun Movement() {
    val moving = 0
    val direction:Int
    val rotationStyle = left-right
    fun leftRight() {
        when (!greenflag) {
            forever() {
                if (Key(A) or key(left - arrow)) {
                    setMoving = 1
                    direction = -90
                    move(-10)
                } else {
                    (setMoving = 0)
                }
                if (Key(D) or key(right - arrow)) {
                    setMoving = 1
                    direction = 90
                    move(10)
                } else {
                    (setMoving = 0)
                }
            }
        }
    }

    fun jump() {
        //Yvel stands for Y-velocity
        when (greenflag) {
                val Yvel = 0
            forever() {
                if (isTouching(Ground)) {
                    Yvel = 0
                    if (Key(space) or Key(up - Arrow)) {
                        Yvel = 10
                    }
                } else {
                    (Yvel = -1)
                }
                Yvel -= Yvel
            }
        }
    }
}