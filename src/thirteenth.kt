// 空安全

/*
在Kotlin中，可以有一个null数值。
Kotlin在缺少某些东西或尚未设置时使用null值。
你已经在集合章节见过一个例子，Kotlin在尝试用地图中不存在的键访问键值对时返回了一个null值。
虽然这样使用null值很有用，但如果你的代码没有准备好处理这些值，可能会遇到问题。
 */
/*
为了帮助防止程序中值出现问题，Kotlin 采用了null空安全机制。
null空安全是在编译时检测值潜在问题，而非运行时。
 */
/*
空安全是一系列功能组合，使你能够：
明确声明什么时候允许在程序中使用null值。
检查null数值。
使用安全调用可能包含null数值的属性或函数。
声明如果检测到null值要采取的操作。
 */

// 可空类型
/*
Kotlin 支持可空类型，这使得声明的类型可以有null取值。
默认情况下，类型不允许接受null值。
可空类型通过在类型声明后添加" ? "显式添加来声明。
 */
fun main1c13() {
    var neverNull: String = "这个变量不能为空"
    // neverNull = null // 抛出编译异常

    var nullable: String? = "你可以把这个变量设置为空"
    nullable = null

    // 默认未声明变量类型的变量不能设为空(null)
}
// 检查空值
// 你可以检查条件表达式中是否有值。
// 函数 可以 有一个语句检查是否不是，以及它是否大于零：
// `maybeString != null && maybeString.length > 0`

// 使用安全访问
/*
为了安全访问可能包含null某个值的对象属性，可以使用安全调用操作符(?.)。
如果对象或其访问的属性为null ，则安全调用操作符返回null。
如果你想避免代码中触发错误的null值，这非常有用。
 */
fun lengthString(maybeString: String?): Int? = maybeString?.length
// `maybeString?.length`
// *安全调用可以串联，如果某个对象的属性包含某个null值，则返回时不会出现错误。例如：
// `person.company?.address?.country`

// 使用Elvis(猫王)算子
// 你可以提供一个默认值，如果检测到某个null值，可以通过使用**Elvis算子(?:)**返回。
// 在Elvis算子的左侧写出应检查的null值。在Elvis算子的右侧写出如果检测到null值应返回的内容。
fun main2c13() {
    val nullString: String? = null
    println(nullString?.length ?: 0) // 0
}

fun main() {
    main1c13()
    main2c13()
}

// Kotlin初级完, 之后为中级