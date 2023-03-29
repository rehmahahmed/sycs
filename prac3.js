console.log("Bank account deposit and withdraw transaction");
function Account(){
    this.balance = 0;
    this.deposit = function(amount){
        this.balance = this.balance + Number(amount);
        displayBalance(this.balance);
    };
    this.withdraw = function(amount){
        this.balance = this.balance - amount;
        displayBalance(this.balance);
    };
}
function displayBalance(balance){
    console.log("Account Balance: ", balance);
};

var account = new Account();
const prompt = require("prompt-sync")({sigint:true});
var amt = prompt("Enter initial deposit amount: ");
account.deposit(amt);
var amt1 = prompt("Enter Second Deposit amount: ");
account.deposit(amt1);
var amt2 = prompt("Enter amount to withdraw: ");
account.withdraw(amt2);
