fun main() {
    val time = 1000000

    println("Был в сети ${agoToText(time)}")
}

fun agoToText(time: Int = 0) = when (time) {
    in 0..60 -> "только что"
    in 61..60 * 60  -> "${time.div(60)} ${checkTimeForMinuets(time)} назад"
    in 60 * 60 + 1..24 * 60 * 60 -> "${time.div(60 * 60)} ${checkTimeForHours(time)} назад"
    in 24 * 60 * 60 + 1..48 * 60 * 60 -> "сегодня"
    in 48 * 60 * 60 + 1..72 * 60 * 60 -> "вчера"
    else -> "давно"
}

fun checkTimeForMinuets(time: Int = 0) = when (time / 60 % 10) {
    1 -> "минуту"
    in 2 .. 4 -> "минуты"
    else -> "минут"
}
fun checkTimeForHours(time: Int = 0) = when (time / (60*60) % 10) {
    1 -> "час"
    in 2 .. 4 -> "часа"
    else -> "часов"
}
