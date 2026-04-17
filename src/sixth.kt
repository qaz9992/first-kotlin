/* Kotlin有以下集合用于分组项目：
   集合类型      描述

 列表(Lists)  有序的物品集合
 集合(Sets)  唯一无序物品集合     <- 当前
 映射、字典、键值对集合(Maps) 键值对集合，键唯一且仅映射到一个值

每种集合类型都可以是可变的或只读的
*/
// .uppercase() 可以将字符串转化为大写
fun main() {
    /*
                       集合
    列表是有序且允许重复物品，而集合则是无序且仅存储独特物品。

    要创建只读集(Set)，可以使用 setOf() 函数。

    要创建可变集(MutableSet)，可以使用 mutableSetOf() 函数。

    创建集合时，Kotlin 可以推断存储的类型。要明确声明类型，请在集合声明后用斜括号(<>)添加类型
     */
    // 只读集合
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    // 可变集合
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    println(readOnlyFruit) // [apple, banana, cherry]
    // 由于集合只包含唯一元素，重复的元素会被丢弃
    // 由于集合是无序的，你无法访问某个特定索引的项目。
    // 要获得集合中的项目数量，可以使用 .count() 函数：
    println("这个集合有 ${readOnlyFruit.count()} 项") // 这个集合有 3 项

    // 要检查某项是否属于集合，可以使用 in 算子：(同fifth.kt 43、44行)
    // 要从可变集合中添加或移除项，分别使用 .add() 和 .remove() 函数：(同fifth.kt 48~54行)
}