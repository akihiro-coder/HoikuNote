fun main(args: Array<String>) {

    // 変数定義
    // valで定義された変数は再代入できない
    val id = 100
    println(id)
    // id = 200 // エラー: Val cannot be reassigned
    // varで定義された変数は再代入できる
    var name = "John"
    println(name) // 出力: John
    name = "Doe"
    println(name) // 出力: Doe


    // 型推論
    val age = 25 // 型はIntと推論される
    println(age) // 出力: 25
    val height = 1.75 // 型はDoubleと推論される
    println(height) // 出力: 1.75
    val isStudent = true // 型はBooleanと推論される
    println(isStudent) // 出力: true
    val greeting = "Hello, World!" // 型はStringと推論される
    println(greeting) // 出力: Hello, World!
    var isEmployed = false // 型はBooleanと推論される
    isEmployed = true
    println(isEmployed) // 出力: true
    // isEmployed = "true" // エラー: Type mismatch


    // 型指定
    val id2: Int = 200 // 型を明示的に指定
    println(id2) // 出力: 200
    // id2 = 300 // エラー: Val cannot be reassigned
    val name2: String = "Alice" // 型を明示的に指定
    println(name2) // 出力: Alice

    var age2: Int = 30 // 型を明示的に指定
    println(age2) // 出力: 30
    age2 = 30
    println(age2) // 出力: 30
    // age2 = "40" // エラー: Type mismatch



    // 条件文
    // if
    val result = isRandom()
    if (result) {
        println("Random is true")
    } else {
        println("Random is false")
    }
    println(result)
}


/*
* isRandom関数
* この関数は、Math.random()を使用して0.5以上の値が生成された場合にtrueを返します。
* それ以外の場合はfalseを返します。
*/
fun isRandom(): Boolean = Math.random() >= 0.5