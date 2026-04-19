// Class(类)

/*
Kotlin 支持面向对象编程，包含类和对象。
对象对于在程序中存储数据非常有用。
类允许你为对象声明一组特征。
从类创建对象可以节省时间和精力，因为你不必每次都声明这些特征。

要声明类，请使用关键字class：
 */
// 属性
// 类的对象所具备的特征可以通过属性来声明。你可以用两种方式为类声明属性：
// 1. 写在类名后面的圆括号内 ()
// `class Contact(val id: Int, var email: String)`
// 2. 写在由大括号定义的类主体内 {}
// ```
// class Contact(val id: Int, var email: String) {
//     val category: String = ""
// }
// ```
/*
我们建议将属性声明为只读（val），除非该属性在类实例创建后需要被修改。
你可以在圆括号内或圆括号外声明 val / var 类型的属性，但只有写在圆括号内的属性，在类实例创建后才能被外部访问。
圆括号内的内容被称为类头（class header）。
在声明类属性时，你可以使用尾逗号。
和函数参数一样，类属性也可以设置默认值：
```
class Contact(val id: Int, var email: String = "example@gmail.com") {
    val category: String = "work"
}
```
 */
/*
创建实例

要从类创建对象，你需要用 **构造函数** 声明一个类 **实例** 。
默认情况下，Kotlin 会自动创建一个构造器，并声明了类头中的参数。
例如：
 */
class Contact(val id: Int, var email: String)
fun main2c12() {
    val contact = Contact(1, "mary@gmail.com")
}
/*
示例如下：
Contact是一个类。
contact是该类Contact的一个实例。
id和email 是属性。
id和 email都与默认构造函数contact一起使用来生成 。
Kotlin 类可以有许多构造函数，包括你自己定义的。想了解更多关于如何声明多个构造子，请参见构造子。
 */
/*
要访问实例的属性，请在实例名称后加上点号(.)后写该属性的名称：
 */
fun main3c12() {
    val contact = Contact(1, "mary@gmail.com")
    println(contact.email) // mary@gmail.com
    contact.email = "jane@gmail.com"
    println(contact.email) // jane@gmail.com
}
/*
除了将属性声明为对象特征的一部分外，你还可以用成员函数定义对象的行为。
在 Kotlin 中，成员函数必须在类体内声明。要调用实例上的成员函数，应在实例名后加上点号(.) 写入函数名。例如：
 */
class Contact2(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}
fun main4c12() {
    val contact = Contact2(1, "mary@gmail.com")
    contact.printId() // 1
}
// 数据类
/*
Kotlin 有数据类，这些类对于存储数据特别有用。
数据类与类具有相同的功能，但它们会自动附加成员函数。
这些成员函数允许你轻松打印实例到可读输出，比较类实例，复制实例等。
由于这些函数会自动可用，你无需为每个类编写相同的模板代码。
 */// 要声明数据类，请使用关键字data：
data class User(val name: String, val id: Int)
/*
数据类中最有用的 预定义成员函数有：
功能;描述
toString();打印一个可读的类实例及其属性字符串。
equals()或==;比较一个类的实例。
copy();通过复制另一个类实例来创建一个类实例，可能带有一些不同的属性。
 */
// 作为字符串打印
/*
打印类实例的可读字符串，你可以显式调用该toString()函数，
或者使用打印函数（ println() 和 print() ），它们会自动调用toString()：
 */
fun main5c12() {
    val user = User("Alex", 1)
    println(user) // User(name=Alex, id=1)
    println(user.toString()) // User(name=Alex, id=1)
}
// 比较实例
// 要比较数据类实例，可以使用等号算子==：
fun main6c12() {
    val user = User("Alex", 1)
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)
    println("user == secondUser: ${user == secondUser}") // user == secondUser: true
    println("user == thirdUser: ${user == thirdUser}") // user == thirdUser: false
}
// 复制实例
// 要创建数据类实例的精确副本，调用实例上的copy()函数。
/*
要创建数据类实例的副本并更改某些属性，请调用实例上的copy()函数，并将属性的替换值作为函数参数添加：
 */
fun main7c12() {
    val user = User("Alex", 1)
    println(user.copy()) // User(name=Alex, id=1)
    println(user == user.copy()) // true

    // 复制user, 并把name改为Max
    println(user.copy("Max")) // User(name=Max, id=1)
    // 复制user, 并把id改为3
    println(user.copy(id = 3)) // // User(name=Alex, id=3)
}
// 创建实例副本比修改原始实例更安全，因为任何依赖原始实例的代码都不会受到副本及其处理的影响。


fun main() {
    main2c12()
    main3c12()
    main4c12()
    main5c12()
    main6c12()
    main7c12()
}