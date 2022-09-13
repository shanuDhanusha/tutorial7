class Retional(x:Int,y:Int){

def num1=x
def num2=y

def check():Boolean=num2 ==0 || num1%num2==0  match {  // we can see num2==0 or num1%num2==0 

    case true =>false
    case  false=>true
  
}

def neg():Unit={  // we give retional number by this function
//check num2==0 and num1%num2==0
if(check()){

println("Retional="+num1.toString() +"/" +num2.toString())

}else{
println("this number is not retional!")


}

}



}



object  Retional{

def main(args: Array[String]): Unit = {
   
var  re=new Retional(6,7)
re.neg()

}





}