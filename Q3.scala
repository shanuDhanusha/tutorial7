object q3{

var bank:List[Account]=List()  // send  Account parmiter to the list
class Account(id:String,n: Int, b: Double) {
val nic:String=id
val acnumber: Int = n
var balance: Double = b
override def toString ="["+nic+":"+acnumber +":"+ balance+"]"


def withdraw(a:Double) =this.balance=this.balance-a  // this function made to see the balance after the transfer
def deposit(a:Double) =this.balance=this.balance+a  //  this function made to see the balance after the deposit
def transfer(a:Account,b:Double)={
    this.withdraw(b)
    a.deposit(b)
    println(a.balance)
    println(this.balance)
}


}
    

def main(args: Array[String]): Unit = {
    var x=new Account("1",5001,3400.0) // we have made object for Account class
    var y=new Account("2",2001,1000.0)

    x.transfer(y,200.0)  // call the transfer func
    
}




}