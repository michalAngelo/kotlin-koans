package iii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate) = when {
        year != other.year -> year - other.year
        month != other.month -> month - other.month
        else -> dayOfMonth - other.dayOfMonth
    }

}

operator fun MyDate.rangeTo(other: MyDate): DateRange = DateRange(this,other)
operator fun MyDate.plus(timeInterval: TimeInterval) = addTimeIntervals(timeInterval,1)
operator fun MyDate.minus(timeInterval: TimeInterval) = addTimeIntervals(timeInterval,-1)
operator fun MyDate.plus(timeInterval: RepeatedTimeInterval) = addTimeIntervals(timeInterval.interval,timeInterval.num)

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange( override val start: MyDate, override val endInclusive: MyDate) : ClosedRange<MyDate>,Iterable<MyDate>{
    override fun iterator(): Iterator<MyDate> = CustomIterator(this)
    override fun contains(value: MyDate): Boolean = start <= value && value <= endInclusive
}

class RepeatedTimeInterval(val interval: TimeInterval,val num: Int)
operator fun TimeInterval.times(num: Int)=RepeatedTimeInterval(this,num)

class CustomIterator(dateRange: DateRange) : Iterator<MyDate> {
    var current= dateRange.start
    var end = dateRange.endInclusive

    override fun hasNext(): Boolean = current <= end

    override fun next(): MyDate {
        var result = current
        current=current.addTimeIntervals(TimeInterval.DAY,1)
        return result
    }

}





