fun Animations() {
    fun movementAnimation() {
        when (!greenflag) {
            forever() {
                if (moving = 1) {
                    wait(0.2)
                    costume = Cat - b
                    wait(0.2)
                    costume = costume1
                }
            }
        }
    }

    fun wall() {
        when (!greenflag) {
            forever() {
                if (background.name = Underground2) {
                    sprite5.show
                } else {
                    (sprite5.hide)
                }
            }
        }
    }
}