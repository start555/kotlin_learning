import kotlin.math.*

fun main(args: Array<String>) {

// 7. Вычислите 1/2+1/4. Ответ: 0.75
fun task7(): Float {
    val x = 1F
    val y = 2F
    val z = 4F
    return x / y + x / z
}
    println(task7())

//8. Вычислите значение выражения (a+4b)(a−3b)+a2 при a=2 и b=3. Ответ:  -94
fun task8():Float {
    val a = 2F
    val b = 3
    return (a + b * 4) * (a - 3 * b) + a.pow(n = 5).toInt()
}
    println(task8())

// 9. Вычислите |x|+x5, если x=−2. Ответ: -30
fun task9():Double {
    val c: Double = -2.0
    return abs(c) + c.pow(n = 5)
}
    println(task9())

//  10. Вычислите значение выражения (x+1)2+3(x+1) при а) x=1.7; б) x=3. Ответ: а) 15.39 б) 28
fun task10():String {
//    val x10 = 1.7 + 1
    val x10 = 3.0 + 1
    val res10 = x10.pow(n = 2) + 3 * x10
    return "%.2f".format(res10)
}
    println(task10())

// 11.
fun task11():String {
    val x11 = -2.34
    val res11 = (abs(x11 - 5) - sin(x11)) / 3 + sqrt(x11.pow(n = 2) + 2014) * cos(2.0 * x11) - 3
    return "%.5f".format(res11)
}
    println(task11())
    // -19.01489125054505

// 12.
fun task12():String {
    val x12 = 3.6
    val res12 = exp(x12 - 2) + abs(sin(x12)) - x12.pow(n = 4) * cos(1 / x12)
    return "%.4f".format(res12)
}
    println(task12())

// 13.
fun task13():String {
    val a13 = 0.1
    val b13 = 0.2
    val x13 = 1.0
    val res13 = Math.pow((x13.pow(n = 2) + b13), 1.0 / 5.0) - (Math.pow(b13, 2.0) * Math.pow(sin(x13 + a13), 3.0)) / x13
    return "%.4f".format(res13)
}
    println(task13())

//14. Пользователь вводит два числа. Найдите сумму и произведение данных чисел
fun task14():String {
    println("Enter number #1: ")
    val firstNumber: Int = readLine()!!.toInt()
    println("Enter number #2: ")
    val secondNumber: Int = readLine()!!.toInt()
    val su = secondNumber + firstNumber
    val mult = secondNumber * firstNumber
    return "Sum = $su \nMult = $mult"
}
    println(task14())

//15. Пользователь вводит число. Выведите на экран квадрат этого числа, куб этого числа.
fun task15() {
    println("Enter a number: ")
    val number: Double = readLine()!!.toDouble()
    val square = Math.pow(number, 2.0).toInt()
    println("Квадрат = $square")
    val cube = Math.pow(number, 3.0).toInt()
    println("Куб = $cube")
}
    task15()

// 20. Пользователь вводит время в минутах и расстояние в километрах. Найдите скорость в м/c.
fun task20() {
    println("Enter time in minutes: ")
    val timeInSec: Double = (readLine()!!.toDouble()) * 60
    println("Enter length in km: ")
    val metrLength: Double = (readLine()!!.toDouble()) * 100
    val speed = (metrLength / timeInSec).toInt()
    println("Speed: $speed m/s")
}
    task20()

// 21.   Даны катеты прямоугольного треугольника. Найдите площадь, периметр и гипотенузу треугольника.
fun task21() {
    val kat1 = 3.0
    val kat2 = 4.0
    val s = (kat1 + kat2) / 2
    println("Площадь: $s")
    val hupo = sqrt(Math.pow(kat1, 2.0) + Math.pow(kat2, 2.0))
    println("Гипотенуза: $hupo")
    val p = kat1 + kat2 + hupo
    println("Периметр: $p")
}
    task21()

// 22.    Дано значение температуры в градусах Цельсия. Вывести температуру  в градусах Фаренгейта.
fun task22() {
    val cel = 40
    val far = (9 * cel) / 5 + 32
    println("$cel градусах Цельсия = $far градусов Фаренгейта")
}
    task22()

// 43.   Пользователь вводит номер месяца. Вывести название поры года (весна, лето и т.д.)
fun task43() {
    println("Enter a month number: ")
    val monthNumber = readLine()
    when (monthNumber) {
        "12" -> print("Winter")
        "01" -> print("Winter")
        "02" -> print("Winter")
        "03" -> print("Spring")
        "04" -> print("Spring")
        "05" -> print("Spring")
        "06" -> print("Summer")
        "07" -> print("Summer")
        "08" -> print("Summer")
        "09" -> print("Autumn")
        "10" -> print("Autumn")
        "11" -> print("Autumn")
        else -> {
            print("Please, make sure that you have entered a correct month number format in XX ")
        }
    }
}
    task43()

// 61. Дано четырехзначное число. Определите, есть ли одинаковые цифры в нем.
fun task61() {
    val myInt = 4005
    val myStr = myInt.toString()
    val initialNumberOfElements = myStr.length
    val mySet = mutableSetOf<Char>()

    myStr.forEach { mySet.add(it) }

    val finalNumberOfElements = mySet.size
    if (initialNumberOfElements == finalNumberOfElements) {
        println("Identical numbers are absent")
    } else {
        println("Identical numbers are present")
    }
}
    task61()

// 68. Даны коэффициенты a,b,c уравнения ax2+bx+c=0. Найти решение.
fun task68() {
    val coef1 = 10
    val coef2 = 5.0
    val coef3 = -3
    val D = (coef2.pow(n = 2) - 4 * coef1 * coef3).toInt()
    val root1: Double
    val root2: Double
    if (D < 0) {
        println("No roots")
    } else if (D == 0) {
        root1 = -coef2 / 2 * coef1
        println("One root $root1")
    } else {
        root1 = (-coef2 + sqrt(D.toDouble())) / (2 * coef1)
        root2 = (-coef2 - sqrt(D.toDouble())) / (2 * coef1)
        println("First root = $root1")
        println("Second root = $root2")
    }
}
    task68()

// 73. Даны два прямоугольника, стороны которых параллельны или перпендикулярны осям координат. Известны координаты
//  левого нижнего угла каждого из них и длины их сторон.
//    а) Определить, принадлежат ли все точки первого прямоугольника второму.
//    б) Определить, принадлежат ли все точки одного из прямоугольников другому.
//    в) Определить, пересекаются ли эти прямоугольники.
fun task73() {
    val X1 = 1.0
    val Y1 = 1.0
    val H1 = 1.0
    val L1 = 2.0

    val X2 = 1.0
    val Y2 = 1.0
    val H2 = 2.0
    val L2 = 6.0

    if ((((X1 + L1) < X2) or (X1 > (X2 + L2))) and (((Y1 + H1) < Y2) or (Y1 > (Y2 + H2)))) {
        println("Прямоугольники не пересекаются")
    } else if ((X1 == X2) and (Y1 == Y2) and (H1 == H2) and (L1 == L2)) {
        println("Прямоугольники совпадают")
    } else if ((X1 >= X2) and ((X1 + L1) <= (X2 + L2)) and (Y1 >= Y2) and ((Y1 + H1) <= (Y2 + H2))) {
        println("Прямоугольники не пересекаются")
        println("1-ый прямоугольник принадлежит 2-ому")
    } else if ((X2 >= X1) and ((X2 + L2) <= (X1 + L1)) and (Y2 >= Y1) and ((Y2 + H2) <= (Y1 + H1))) {
        println("Прямоугольники не пересекаются")
        println("2-ой прямоугольник принадлежит 1-ому")
    } else {
        println("Прямоугольники пересекаются")
        println("Нет принадлежности всех точек одного к другому")
    }
}
    task73()

// 72. Даны два прямоугольника, стороны которых параллельны или перпендикулярны осям координат.
// Известны координаты левого нижнего угла каждого из них и длины их сторон.
// Найти координаты левого нижнего и правого верхнего углов минимального прямоугольника,
// содержащего указанные прямоугольники.
fun task72() {

    val x1 = 2.0
    val y1 = 2.0
    val a1 = 4.0
    val b1 = 2.0

    val x2 = 5.0
    val y2 = 6.0
    val a2 = 2.0
    val b2 = 6.0

    val x3: Double
    val y3: Double

    val x4: Double
    val y4: Double

    if (x1 + a1 > x2 + a2) {
        x3 = x1 + a1
    } else {
        x3 = (x2 + a2)
    }

    if (y1 + b1 > y2 + b2) {
        y3 = y1 + b1
    } else {
        y3 = y2 + b2
    }
    println("Upper right corner of the common rectangle x= $x3 y= $y3")

    x4 = Math.min(x1, x2)
    y4 = Math.min(y1, y2)
    println("Bottom left corner of the common rectangle x= $x4 y= $y4")
}
    task72()
}
