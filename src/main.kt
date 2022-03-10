fun main(){
    word()
    var y =divide(20,3)
    println(y)
    var x = parameter("Catherine",20)
    println(x)
    length()

}
fun word(){
    var name = "codeHive"
    println(name[5].toString()+name[6]+name[7])
}
fun divide(a:Int,b:Int):Int{
    var division=a/b
    return division

}
fun parameter(name:String,age:Int):String{
var stmt = "Hi my $name is and am $age years old"
    return stmt


}
fun length(){
    var name = "Akirachix"
    println(name.length)
}