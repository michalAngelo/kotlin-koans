package syntax

import syntax.forWhileLoops.forLoop
import syntax.forWhileLoops.iteratingOverMap
import syntax.ifWhenExpressions.ifExpression
import syntax.ifWhenExpressions.whenWithoutArgument
import syntax.objectExpressions.objectLiteral

/**
 * Created by michalp on 03.02.2016.
 */

fun main(args: Array<String>) {
    val list =listOf("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16")
    forLoop(list)
    val map= mapOf<Int,String>(Pair(1,"a"), Pair(2,"b"), Pair(3,"c"))
    iteratingOverMap(map)
    System.out.print("\n")
    ifExpression(1,10)
    whenWithoutArgument(1)
    whenWithoutArgument(42)
    whenWithoutArgument(0)
    objectLiteral()
}
