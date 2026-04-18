// ## 命名参数

/*
对于简洁的代码，调用函数时不必包含参数名。
不过，包含参数名确实会让你的代码更易读。这被称为使用**命名参数**。
如果你包含参数名称，那么你可以以任意顺序写入参数。
 */

// ## 默认参数值
// 你可以为函数参数定义默认值。调用函数时可以省略任何默认值的参数。
// 要声明默认值，请在类型后使用赋值操作符：=
fun printMessageWithPrefix(message: String, prefix: String="Info") {
    println("[$prefix] $message")
}
fun main() {
    // 使用具(有)名参数，并调换了参数顺序。
    printMessageWithPrefix(prefix = "Log", message = "Hello") // [Log] Hello
    printMessageWithPrefix("Hello world!") // [Info] Hello world!
    // 你可以跳过默认值的参数，而不是全部省略。然而，在第一个跳过的参数之后，你必须命名所有后续参数。
}