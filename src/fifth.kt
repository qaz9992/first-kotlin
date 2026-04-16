/* Kotlin有以下集合用于分组项目：
   集合类型      描述

 列表(Lists)  有序的物品集合     <- 当前
 集合(Sets)  唯一无序物品集合
 映射、字典、键值对集合(Maps) 键值对集合，键唯一且仅映射到一个值

每种集合类型都可以是可变的或只读的
*/

fun main() {
    /*
           列表
列表按添加的顺序存储物品，并允许重复物品。

要创建只读列表(List)，请使用listOf()函数。

要创建可变列表(MutableList)，可以使用 mutableListOf()函数。

在创建列表时，Kotlin 可以推断存储的物品类型。要明确声明类型，请在列表声明后用斜括号(<>)添加类型
                示例:
 */
    // 只读列表
    val readOnlyShapes = listOf("a", "b", "c")
    println(readOnlyShapes) // [a, b, c]

    // 可变列表
    val shapes: MutableList<String> = mutableListOf("abc", "abcd", "abcde")
    println(shapes) // [abc, abcd, abcde]


    // 由于列表是有顺序的，要访问列表中的某个项目，可以使用索引访问算符: []

    println("列表的第一项: ${readOnlyShapes[0]}") // 列表的第一项: a

    // 要获取列表中的第一个或最后一个项目，分别使用 .first() 和 .last() 函数：
    println("列表的最后一项: ${readOnlyShapes.last()}") // 列表的最后一项: c

    // 要获取列表中的项目数量，可以使用 .count() 函数：
    println("这个列表有 ${readOnlyShapes.count()} 项") // 这个列表有 3 项

    // 要检查某个项是否在列表中，可以使用 in 操作符：
    println("a" in readOnlyShapes) // true
    println("d" in readOnlyShapes) // false

    // 要从可变列表中添加或移除项目，分别使用 .add() 和 .remove() 函数：

    // 添加 abcdef 至列表
    shapes.add("abcdef")
    println(shapes) // [abc, abcd, abcde, abcdef]

    // 从列表中移除第一个 abcdef
    shapes.remove("abcdef")
    println(shapes) // [abc, abcd, abcde]
}