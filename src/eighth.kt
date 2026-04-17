/*
和其他编程语言一样，Kotlin 可以根据一段代码的运算结果是否为真来执行判断逻辑。
这类代码被称为条件表达式。
Kotlin 同样支持创建循环并对其进行遍历。
 */

// 条件表达式
fun main() {
    // Kotlin 提供 if 和 when 用于检查条件表达式。
    /*
    ***如果你必须在if和when之间选择，我们推荐使用when，因为你使用它：
    让你的代码更易读。
    让增加另一个分支更容易。
    这样代码中的错误会更少。
     */


    // if
    var d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    } // 或者
    d = if (check) {
        1
    } else {
        0
    }

    println(d) // 1

    /*
    Kotlin 中没有三元运算符。作为替代，if 可以当作表达式使用。如果每个分支只有一行代码，花括号可以省略：
    条件 ? 执行语句 : 执行语句
    对应 Kotlin 写法：if(条件) 执行语句
     */
    val a = 1
    val b = 2

    println(if (a > b) a else b) // 返回一个值: 2


    // when
    // 当你有一个包含多个分支的条件表达式时使用 when
    /*
    使用 : when
    将你需要判断的值放在小括号 () 中
    将分支逻辑放在大括号 {} 中
    在每个分支里，使用 -> 分隔判断条件和条件成立时要执行的逻辑
     */
    val obj = "Hello"

    when (obj) {
        // Checks whether obj equals to "1"
        "1" -> println("One")
        // Checks whether obj equals to "Hello"
        "Hello" -> println("Greeting")
        // Default statement
        else -> println("Unknown")
    } // Greeting
    // *注意所有分支条件都会依次检查，直到满足其中一个。因此，只执行第一个合适的分支。

    // 表达式返回一个可以后续代码使用的值。
    //这里有一个使用when作为表达式的例子。when表达式立即被赋予一个变量，随后该变量与println()函数一起使用
    val result = when (obj) {
        // If obj equals "1", sets result to "one"
        "1" -> "One"
        // If obj equals "Hello", sets result to "Greeting"
        "Hello" -> "Greeting"
        // Sets result to "Unknown" if no previous condition is satisfied
        else -> "Unknown"
    }
    println(result) // Greeting

    /*
    到目前为止你见过的 when 示例都带有主体（subject），例如：when (obj)。
    但 when 也可以不指定主体使用。
    下面这个示例使用无主体的 when 表达式，来检查一连串布尔（Boolean）表达式。
     */
    val trafficLightState = "Red" // This can be "Green", "Yellow", or "Red"

    val trafficAction = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction)
    // Stop
}