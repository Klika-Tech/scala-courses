package klikatech._1_week._3_arrays_generics

// Arrays
object Example1 {
    // public final int[] arr = new int[]{0, 1, 2, 3, 4}
    val arr: Array[Int] = Array(0, 1, 2, 3, 4)
    val elem2: Int = arr(2) // Java: arr[2]

    def main(args: Array[String]) {
        println("elem2: " + elem2)
    }
}
