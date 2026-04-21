// 范围功能

/*
在编程中，作用域是你的变量或对象被识别的区域。最常被提及的范围是全局范围和局部范围：
全局范围——一个可从程序中任意位置访问的变量或对象。
局部作用域——仅在定义该对象的块或函数内可访问的变量或对象。
 */
// 在 Kotlin 中，还有作用域函数，允许你在对象周围创建临时作用域并执行代码。
/*
作用域函数使代码更简洁，因为你不必在临时作用域中引用对象名称。
根据作用域函数，你可以通过this关键词引用对象，或者通过关键字 it作为参数访问该对象。
Kotlin共有五个作用域函数：let、run、also、apply和with。
每个作用域函数都接收一个λ表达式，返回对象或λ表达式的结果。
在本次导览中，我们将介绍每个示波器功能及其使用方法。
 */
// Let
// 当你想在代码中执行空检查，之后对返回的对象执行进一步操作时，可以使用 scope 函数let。
fun sendNotification(recipientAddress: String): String {
    println("Yo $recipientAddress!")
    return "Notification sent!"
}
fun getNextAddress(): String {
    return "sebastian@jetbrains.com"
}
fun main1c15() {
    // `val address: String? = getNextAddress()` // 此为原来的代码
    val address: String = getNextAddress() // 为了防止报错
    sendNotification(address)
}
/*
该示例有两个功能：

sendNotification()，该函数有一个函数参数recipientAddress，返回一个字符串。
getNextAddress()，该函数没有函数参数，返回字符串。
示例创建了一个具有可空类型类型的变量。
但当你调用sendNotification()该函数时，
这个address问题就成了问题，因为这个函数并不预期address该String值可以是某个null值。
编译器因此报告了一个错误：
// Kotlin: Argument type mismatch: actual type is 'String?', but 'String' was expected.
 */
/*
从初学者学习中，你已经知道可以用if条件进行null检查，或者使用Elvis操作(?:)。
但如果你想在代码后面使用返回的对象呢？你可以通过if条件和else分支来实现
 */
// 然而，更简洁的方法是使用作用域函数let：
fun main2c15() {
    val address: String? = getNextAddress()
    val confirm = address?.let {
        sendNotification(it)
    }
}
/*
举个例子：
生成称为 address 和 confirm 的变量。
对address变量的 scope 函数let使用安全调用。
在作用域函数let中创建一个临时作用域。
将sendNotification()函数作为λ表达式传递到作用域函数let中。
通过 address表示变量，使用临时作用域it。
将结果赋予confirm变量。
通过这种方法，你的代码可以处理address变量可能是一个null值，并且你可以在代码后面使用这个confirm变量。
 */
// Apply
/*
使用scope函数apply在创建时初始化对象，比如类实例，而不是在代码后面。
这种方法让你的代码更易阅读和管理。
 */


fun main() {
    main1c15()
    main2c15()
}