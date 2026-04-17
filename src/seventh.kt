/* Kotlin有以下集合用于分组项目：
   集合类型      描述

 列表(Lists)  有序的物品集合
 集合(Sets)  唯一无序物品集合
 映射、字典、键值对集合(Maps) 键值对集合，键唯一且仅映射到一个值     <- 当前

每种集合类型都可以是可变的或只读的
*/
/*
Map
Map将物品存储为键值对。
你通过引用密钥来获取该值。
你可以把Map想象成食物菜单。
你可以通过找到你想吃的食物（钥匙）来确定价格（价值）。
如果你想查找一个数值而不使用编号索引，比如List，Map很有用。
 */
fun main() {
//    映射中的每个键都必须是唯一的，这样 Kotlin 才能理解你想要得到的值。
//
//    地图中可以有重复的数值。
    /*
    要创建只读映射(Map)，可以使用 mapOf() 函数。

    要创建可变映射(MutableMap)，可以使用 mutableMapOf() 函数。

     */
     /*在创建地图时，Kotlin 可以推断存储物品的类型。
     要明确声明类型，在映射声明后用角括号(<>)添加键和值的类型。
     例如：MutableMap<String, Int>键的类型为String，值的类型为Int 。
      */
    // 创建映射最简单的方法是使用to在每个键与其相关值之间：

    // 只读映射
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu) // {apple=100, kiwi=190, orange=100}

    // 可变映射
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu) // {apple=100, kiwi=190, orange=100}

    // 要访问映射中的某个值，可以使用索引访问算符及其键：[]
    println("苹果汁的值(价格)是: ${readOnlyJuiceMenu["apple"]}") // 苹果汁的值(价格)是: 100

    //*如果你尝试用一个不存在于映射中的键访问键值对，你会看到一个值：null

    // 你也可以使用索引访问操作符，将物品添加到可变地图中：[]
    juiceMenu["coconut"] = 150 // 向映射(map)中添加键为 coconut、值为 150 的项
    println(juiceMenu) // {apple=100, kiwi=190, orange=100, coconut=150}

    // 要从可变映射中移除物品，请使用.remove() 函数：
    juiceMenu.remove("coconut")    // 在映射(Map)中移除键 coconut
    println(juiceMenu) // {apple=100, kiwi=190, orange=100}

    // 要获取地图中物品的数量，可以使用 .count() 函数：
    println("这个映射有 ${readOnlyJuiceMenu.count()} 个键值对") // 这个映射有 3 个键值对

    // 要检查某个特定键是否已经包含在地图中，可以使用 .containsKey() 函数：
    println(readOnlyJuiceMenu.containsKey("kiwi")) // true
    println(readOnlyJuiceMenu.containsKey("coconut")) // false

    // 要获得映射的键或值集合，分别使用 .keys 和 .values 属性：
    println(readOnlyJuiceMenu.keys) // [apple, kiwi, orange]
    println(readOnlyJuiceMenu.values) // [100, 190, 100]

    // 要检查键或值是否在映射中，可以使用 in 运算符：
    println("orange" in readOnlyJuiceMenu.keys) // true
    // 另外，你无需用到 keys 这个属性
    println("orange" in readOnlyJuiceMenu) // true

}