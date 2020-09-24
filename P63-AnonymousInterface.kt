//Execution starts from Main
fun main() {
    //Kotlin Anonymous Interfaces

    val button = Button()
    val image = Image()
//    button.click() throws kotlin.UninitializedPropertyAccessException as lateinit property clickListener has not been initialized
    button.clickListener = object : OnClickListener { //inline object of interface
        override fun onClick() {
            println("Button clicked")
        }
    }
    button.click() //Prints Button Clicked

    //Setting listener on Button
    button.setMyClickListener(object : OnClickListener {
        override fun onClick() {
            println("Listener set and clicked")
        }
    })
    button.click() //Prints Listener set and clicked

    //Setting listener on Image
    image.setMyClickListener(object : OnClickListener {
        override fun onClick() {
            println("Image clicked")
        }
    })

    image.click() //Prints Image clicked
}

interface OnClickListener {
    fun onClick()
}

open class View {
    lateinit var clickListener: OnClickListener

    //Setter for listener
    fun setMyClickListener(clickListener: OnClickListener) {
        this.clickListener = clickListener
    }

    fun click() {
        clickListener.onClick()
    }
}

class Button : View()
class Image : View()