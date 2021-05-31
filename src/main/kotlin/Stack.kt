class Stack {

    val items = ArrayList<Int>()
    var top: Int = 0

    fun push(item: Int) {
        items.add(item)
        top++
        println("push($item) | top = $top")
    }

    fun pop(): Int? {
        if (top == 0) {
            println("underflow")
            return null
        } else {
            top--
            println("popped(return: ${items[top]})")
            return items[top]
        }
    }

    fun peek(): Int? {
        if (top == 0) {
            return null
        } else {
            println("peek(return: ${items[top - 1]})")
            return items[top - 1]
        }
    }
}