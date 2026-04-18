// 你可以用 Kotlin 的fun关键字声明自己的函数。

// *我们建议在编码规范中为函数命名，以小写字母开头，使用无下划线的骆驼字母。

fun hello() {
    println("Hello, world!") // Hello, world!
}

/*
sum函数中：
x和y 是函数参数。
x和y类型为 Int。
该函数的返回类型为Int 。
调用时，该函数返回 x 和 y 的和。
 */
fun sum(x: Int, y: Int): Int {
    return x + y
}

fun main() {
    hello() // Hello, world!
    /*
    在 Kotlin 中：
    函数参数写在括号()内。
    每个参数必须有类型，且多个参数必须用逗号(,)分隔。
    返回类型写在函数括号() 之后，中间用冒号(:)分隔。
    函数的主体写在大括号{}内。
    return关键词用于退出或返回函数中的某项内容。
     */
    println(sum(1, 2)) // 3
}