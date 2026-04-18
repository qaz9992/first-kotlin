// ## 无返回函数

/*如果你的函数没有返回有用的值，那么它的返回类型是Unit 。
Unit是一个只有一个值的类型 – 。
你不必在函数体中明确声明返回Unit。
这意味着你不必使用Unit关键词或return声明返回类型
 */
fun printMessage(message: String) {
    println(message)
    // `return Unit` 或 `return` 是有选择的
}
// ## 单表达式函数

// 你可以去除大括号{}，并使用赋值算符(=)声明函数主体。
// 当你使用赋值算子(=)时，Kotlin使用类型推断，因此你也可以省略返回类型。
// sum()函数随后变成一条直线：
// 示例中将sum函数命名为sum2
fun sum2(x: Int, y: Int) = x + y

// 然而，如果你希望代码能被其他开发者快速理解，最好即使使用赋值运算符(=)，也明确定义返回类型。
// 如果你用大括号{}声明函数体，除非是返回Unit类型，否则必须声明返回类型。

fun main() {
    printMessage("Hello") // Hello

    println(sum2(1, 2)) // 3
}
