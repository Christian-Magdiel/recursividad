fun main(args: Array<String>) {
    print ("la diferencia entre 10 y 7 es ;  ${numberCounter( 7,10)}")
}

fun numberCounter(startNumber:Int,finalNumber:Int):Int{
    val suma:Int
    if(startNumber != finalNumber){
        suma = 1 + numberCounter( startNumber+ 1 , finalNumber )
    }else {
        return 0
    }
    return suma
}