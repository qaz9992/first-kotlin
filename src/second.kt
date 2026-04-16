fun main() {
    val value = 10 // 设置一个只读变量value的值为10, val: 只读变量
    var v = 100 // 设置一个可变变量v的值为100, var: 可变变量
    v = 50 // 可变变量可以修改数值
    // value = 1 // 这样会报错, 只读变量不能修改数值; 一旦给了只读变量一个值, 就不能更改它

    println(v) // 输出变量 v
    println(value) // 输出变量 value
}

// 应该输出:
// 50
// 10