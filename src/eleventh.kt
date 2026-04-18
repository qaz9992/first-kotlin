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
// λ表达式可以有多种使用方式。你可以：
// - 将一个λ表达式作为参数传递给另一个函数
// - 从函数返回λ表达式
// - 单独调用一个λ表达式

/* ## 传递到另一个函数
一个很好的例子是，将 lambda 表达式传递给函数，就是在集合中使用 .filter() 函数：
 */
fun main2() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val positives = numbers.filter ({ x -> x > 0 })
    val isNegative = { x: Int -> x < 0 }
    val negatives = numbers.filter(isNegative)

    println(positives) // [1, 3, 5]
    println(negatives) // [-2, -4, -6]
}// .filter()函数接受一个λ表达式作为谓词，并将其应用于列表中的每个元素。
// 函数只有当谓词返回 true 时才保留元素：
/*
{ x -> x > 0 }如果元素为正，则返回true。
{ x -> x < 0 }如果元素为负，则返回true。
 *//*
如果只有一个λ表达式是函数参数，你可以去掉括号中的函数：()
`val positives = numbers.filter { x -> x > 0 }`
这是一个后置λ的例子，本章末尾将有更详细的讨论。
 */// 另一个很好的例子是使用 .map() 函数来转换集合中的项目：
fun main3() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val doubled = numbers.map { x -> x * 2 }

    val isTripled = { x: Int -> x * 3 }
    val tripled = numbers.map(isTripled)

    println(doubled) // [2, -4, 6, -8, 10, -12]
    println(tripled) // [3, -6, 9, -12, 15, -18]
}/*
.map()函数接受λ表达式作为变换函数：
{ x -> x * 2 }取列表中的每个元素，返回该元素乘以2。
{ x -> x * 3 }取列表中的每个元素，返回该元素乘以3。
*/

// ## 功能类型

/*
在你能从函数返回λ表达式之前，首先需要理解函数类型。
你已经学过基本类型，但函数本身也有类型。Kotlin 的类型推断可以从参数类型推断出函数的类型。
但有时你可能需要明确指定函数类型。
编译器需要函数类型，这样它才能知道该函数允许什么，不能使用什么。
函数类型的语法如下：
每个参数的类型都写在括号()内，并用逗号(,)分隔。
返回类型写在 -> 之后。
例如：(String) -> String或(Int, Int) -> Int。
如果定义了函数类型，λ表达式upperCaseString()的样子如下：
(text参数类型String, 返回类型String)
 */
val upperCaseString2: (String) -> String = { text -> text.uppercase() }
// 如果你的λ表达式没有参数，那么括号()会留空。例如() -> Unit：
val printInConsoleHelloWorld: () -> Unit = { println("Hello World!") }
/*
## 函数返回
Lambda表达式可以从函数返回。为了让编译器理解返回的λ表达式类型，你必须声明一个函数类型。
 */
// ## 单独调用
// Lambda表达式可以通过在大括号{}后加括号()，并在括号内包含任意参数来单独调用：
fun main4() {
    println({ text: String -> text.uppercase() }("hello")) // HELLO
}

// ## 后置λ
// 正如你已经看到的，如果 lambda 表达式是唯一的函数参数，你可以去掉括号()中的函数。
// 如果将λ表达式作为函数的最后一个参数传递，则该表达式可以写在函数括号()之外。
// 在这两种情况下，这种语法都称为尾随λ。
// 例如 .fold() 函数接受初始值和一个操作：
fun main5() {
    println(listOf(1, 2, 3).fold(0, { x, item -> x + item })) // 6
    println(listOf(1, 2, 3).fold(0) { x, item -> x + item })  // 6
}

fun main() {
    println(upperCaseString("hello")) // HELLO
    println(upperCaseString2("hello")) // HELLO
    main2()
    main3()
    printInConsoleHelloWorld() // Hello World!
    main4()
    main5()
}
