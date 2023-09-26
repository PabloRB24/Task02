fun main(args: Array<String>) {

    torre(4,4)
    piramide(6)

}

fun torre(fil:Int, col:Int ){
    if((fil == 0) && (col != 0)){
        println("No puede tener ventanas y no pisos")

    }else {
        repeat(col) {
            print("___")
        }
        println("")
        repeat(fil) {
            print("|")
            repeat(col) {
                print("_‖_")
            }
            if (fil == 0)
                print(" |")
            else
                print("|")

            println("")
        }
    }


}

fun piramide(num:Int){
    var lin:String=""
    var vec:Int = 0
    repeat(num){
        vec = num-it
        repeat(vec){
            print(" ")
        }
        print("/")
        print(lin)
        print("\\")
        lin += "__"
        println("")
    }

}

