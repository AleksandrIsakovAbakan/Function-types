fun main() {
    val a = 170.0
    println("Факториал числа $a = ${factorial(a)}")
    println()

    val n = 9
    println("$n-я степень числа 10 с применением рекурсии: ${findsNthPowerOf10(n)}")
    println()

    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    println(array.contentToString())
    println("Написать функцию, которая будет увеличивать элемент массива на единицу, находящийся через одну позицию.")
    println("Т.е. массив на выходе будет такой [2, 2, 4, 4, 6, 6, 8].")
    incrementsArrayElementOnePositionApartByOne(array)
    println(array.contentToString())

}

/*
Написать программу, которая будет вычислять факториал числа с применением рекурсии.
*/
fun factorial(n: Double): Double {
    return if (n == 0.0 || n == 1.0) 1.0 else factorial(n - 1) * n
}

/*
Написать функцию, которая находит N-ю степень числа 10 с применением рекурсии.
*/
fun findsNthPowerOf10(n: Int): Int {
    return if (n == 1) 10 else findsNthPowerOf10(n - 1) * 10
}

/*
Дан массив val array = arrayOf(1, 2, 3, 4, 5, 6, 7).
Написать функцию, которая будет увеличивать элемент массива на единицу, находящийся через одну позицию.
Т.е. массив на выходе будет такой [2, 2, 4, 4, 6, 6, 8].
*/
fun incrementsArrayElementOnePositionApartByOne(array: IntArray) {
    for (a in array.indices) if (a % 2 == 0) array[a] += 1
}