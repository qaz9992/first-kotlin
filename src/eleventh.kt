// # λ(lambda)表达式

// Kotlin允许你通过使用λ表达式为函数写更简洁的代码。

// 例如，以下uppercaseString()函数：
/*
fun uppercaseString(text: String): String {
    return text.uppercase()
}
fun main() {
    println(uppercaseString("hello"))// HELLO
}
 */// 也可以写成λ表达式
val upperCaseString = { text: String -> text.uppercase() } // lambda表达式
/*
λ表达式乍看之下可能难以理解，所以我们来拆解一下。
λ表达式写在大括号{}内。
在λ表达式中，你写道：
参数后跟一个-> 。
函数体在-> 后面。

在前一个例子中：
text是一个函数参数。
text具有String类型。
该函数返回调用于text的 .uppercase() 函数的结果。
整个λ表达式赋值为变量(upperCaseString=)。
λ表达式的调用方式是将变量(upperCaseString)当作函数，字符串("hello")作为参数。
println()函数打印结果。
 */
/*
如果你声明一个没有参数的 lambda，那么就不需要使用-> ,例如：
{ println("Log message") }
 */
val printStringLogMessage = { println("LogMessage") }

fun main() {
    println(upperCaseString("hello")) // HELLO
}
