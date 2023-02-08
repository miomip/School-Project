fun Transitions() {
    when (greenflag) {
        forever() {
            if (background.name = Underground2) {
                if (x.position = 260) {
                    background = Underground1
                    x.value = -250
                    glide(x = -189, y = -98, time = 0.3 sec)
                }
            }
            if (background.name = Underground1) {
                if (x.position = 260) {
                    background = First_Blackout
                    x.value = -250
                    glide(x = -189, y = -98, time = 0.3 sec)
                }
            }
            if (background.name = Underground1) {
                if (x.position = 260) {
                    background = Underground2
                    x.value = 250
                    glide(x = 189, y = -98, time = 0.3 sec)
                }
            }
            if (background.name = First_Blackout) {
                if (x.position = -260) {
                    background = Underground1
                    x.value = 250
                    glide(x = 189, y = -98, time = 0.3 sec)
                }
            }
        }
    }
}