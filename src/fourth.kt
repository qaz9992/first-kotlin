fun main() {
    var customers = 10
    customers = 8

    // --- 扩展赋值算符 --- //
    customers += 3 // 11
    customers -= 6 // 5
    customers *= 2 // 10
    customers /= 5 // 2
    // --- --- --- //

    println(customers) // 2

    /*
    总体来说，Kotlin有以下基本类型：
    类别             基本类型                     示例代码

    整数      Byte, Short, Int, Long      val year: Int = 2020
    无符号整数 UByte, UShort, UInt, ULong  val score: UInt = 100u
    浮点数    Float, Double  val currentTemp: Float = 24.5f, val price: Double = 19.99
    布尔值    Boolean                  val isEnabled: Boolean = true
    字符      Char                     val separator: Char = ','
    字符串    String                 val message: String = "Hello, world!"
    */

    var int_num: Int
    int_num = 10000
    var hello: String = "hello"

    println(int_num) // 10000
    println(hello) // hello
}