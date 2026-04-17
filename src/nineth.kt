/*
和其他编程语言一样，Kotlin 可以根据一段代码的运算结果是否为真来执行判断逻辑。
这类代码被称为条件表达式。
Kotlin 同样支持创建循环并对其进行遍历。
 */

// Ranges

// 区间（Ranges）
//在讲解循环之前，了解如何构建供循环遍历的区间是很有用的。
//在 Kotlin 中创建区间最常用的方式是使用 .. 运算符。例如，1..4 等价于 1, 2, 3, 4。
//若要声明不包含结束值的区间，使用 ..< 运算符。例如，1..<4 等价于 1, 2, 3。
//若要声明倒序区间，使用 downTo。例如，4 downTo 1 等价于 4, 3, 2, 1。
//若要声明非 1 步长的区间（自定义递增 / 递减数值），使用 step 加上你需要的步长值。例如，1..5 step 2 等价于 1, 3, 5。
//你也可以为字符（Char） 创建区间：
//'a'..'d' 等价于 'a', 'b', 'c', 'd'
//'z' downTo 's' step 2 等价于 'z', 'x', 'v', 't'

// Loop
// 编程中最常见的两种循环结构是for和while。
// for用于遍历多个值并执行一个操作。
// while用于持续执行动作直到满足特定条件。

fun main() {
    // for
    // 利用你对范围的新知识，你可以创建一个for循环，迭代数字1到5，每次打印数字。
    //将迭代器和范围置于括号()内，关键词为 in。将你想完成的动作加上大括号{}
    for (number in 1..5) {
        // number is the iterator and 1..5 is the range
        print(number)
    } // 12345
    println()
    // 集合也可以通过循环来迭代：

    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
    /*
    Yummy, it's a carrot cake!
    Yummy, it's a cheese cake!
    Yummy, it's a chocolate cake!
    */


    // while
    // while可以有两种用途：
    // 在条件表达式为真时执行代码块。(while)
    // 先执行代码块，然后检查条件表达式。(do-while)

    /*
    在第一个用例中 while()：
    在括号()内声明你的while循环的条件表达式继续。
    在大括号内添加你想完成的动作。{}
     */
    // 以下示例使用增量算子++来递增变量cakesEaten的值。
    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }
    // Eat a cake
    // Eat a cake
    // Eat a cake
    /*
    第二种使用场景：do-while 循环
    将用于判断循环是否继续执行的条件表达式，写在小括号 () 中
    使用关键字 do，并把你要执行的循环逻辑写在大括号 {} 内部
     */
    var cakesBaked = 0
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)
// Bake a cake
// Bake a cake
// Bake a cake

}