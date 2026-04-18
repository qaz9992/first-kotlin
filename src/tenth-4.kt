// ## 函数更早返回

/*
要阻止函数中的代码被处理超过某一行，请使用return关键字。
本例使用了如果条件表达式为真，则从函数提前返回：if
 */
fun is_even(x: Int): Boolean {
    if (x < 0) {
        return false
    }
    return x % 2 == 0
}
fun main() {
    println(is_even(2)) // true
    println(is_even(-8)) // false
    println(is_even(7)) // false
}