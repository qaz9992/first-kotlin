// 扩展函数

// 在本章中，你将探索使代码更简洁易读的特殊Kotlin函数。
// 了解他们如何帮助你利用高效的设计模式，将项目提升到新高度。

/*
在软件开发中，你通常需要修改程序的行为而不改变原始源代码。
例如，你可能想为第三方库的类添加额外功能。

你可以通过添加扩展函数来扩展类来实现这一点。
你调用扩展函数的方式与调用类的成员函数相同，使用点号(.)。

在介绍扩展函数的完整语法之前，你需要先了解什么是接收器。
接收器是函数调用的对象。
换句话说，接收者就是信息共享的对象或地点。
 */
fun main1c14() {
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println("此列表中的第一个项目为: ${readOnlyShapes.first()}")
// 此列表中的第一个项目为: triangle
}
/*
在这个例子中，main()函数调用 .first() 函数返回列表中的第一个元素。
.first()函数在readOnlyShapes变量上被调用，因此readOnlyShapes变量是接收方。
 */
/*
要创建扩展函数，写出你想扩展的类名，后面跟"."和函数名。
继续执行函数声明的其余部分，包括参数和返回类型。
 */
fun String.bold(): String = "<b>$this</b>"
fun main2c14() {
    val hello: String = "Hello"
    println(hello.bold()) // <b>Hello</b>
    println("Hello".bold()) // <b>Hello</b>
}
/*
在这个例子中：
String是扩展类。
bold是扩展函数的名称。
扩展函数(.bold)的返回类型为String 。
(String)"hello"，作为接收方的实例。
接收器通过this关键词在正体内访问：
字符串模板（$）用于访问 this 的值。
扩展函数.bold()会用字符串返回为加粗文本的 HTML 元素(<b>)。
*/
// 面向扩展的设计
// 你可以在任何地方定义扩展函数，这使你能够创建面向扩展的设计。
// 这些设计将核心功能与有用但非必需的功能分离开来，使代码更易阅读和维护。


fun main() {
    main1c14()
    main2c14()
}