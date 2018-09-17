import kotlin.math.*

fun main(args: Array<String>){

// 7. Вычислите 1/2+1/4. Ответ: 0.75
    val x = 1F
    val y = 2F
    val z = 4F
    val res = x/y + x/z
    println(res)

//8. Вычислите значение выражения (a+4b)(a−3b)+a2 при a=2 и b=3. Ответ:  -94
    val a = 2
    val b = 3
    val res2 = ((a + b*4)*(a - 3*b) + Math.pow(a.toDouble(), 2.0)).toInt()
    println(res2)

// 9. Вычислите |x|+x5, если x=−2. Ответ: -30
    val c: Double = -2.0
    val res3 = (abs(c) + Math.pow(c, 5.0)).toInt()
    println(res3)

//  10. Вычислите значение выражения (x+1)2+3(x+1) при а) x=1.7; б) x=3. Ответ: а) 15.39 б) 28
    //val x10 = 1.7
    val x10 = 3.0
    val res10 = Math.pow((x10+1), 2.0) + 3*(x10+1)
    println("%.2f".format(res10))

// 11.
    val x11 = -2.34
    val res11 = (abs(x11-5) - sin(x11))/3 + sqrt(Math.pow(x11, 2.0) + 2014) * cos(2.0 * x11)-3
    println("%.5f".format(res11))
    // -19.01489125054505

// 12.
    val x12 = 3.6
    val res12 = exp(x12-2) + abs(sin(x12)) - Math.pow(x12, 4.0) * cos(1/x12)
    println("%.4f".format(res12))

// 13.
    val a13 = 0.1
    val b13 = 0.2
    val x13 = 1.0
    val res13 = Math.pow((Math.pow(x13, 2.0) + b13), 1.0/5.0) - (Math.pow(b13, 2.0)*Math.pow(sin(x13+a13), 3.0))/x13
    println("%.4f".format(res13))

//14. Пользователь вводит два числа. Найдите сумму и произведение данных чисел
    println("Enter number #1: ")
    val firstNumber: Int = readLine()!!.toInt()
    println("Enter number #2: ")
    val secondNumber: Int = readLine()!!.toInt()
    val su = secondNumber + firstNumber
    val mult = secondNumber * firstNumber
    println("Sum = $su")
    println("Mult = $mult")

//15. Пользователь вводит число. Выведите на экран квадрат этого числа, куб этого числа.
    println("Enter a number: ")
    val number: Double = readLine()!!.toDouble()
    val square = Math.pow(number, 2.0).toInt()
    println("Квадрат = $square")
    val cube = Math.pow(number, 3.0).toInt()
    println("Куб = $cube")





}