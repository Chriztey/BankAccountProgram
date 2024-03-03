package com.chris.bankaccountprogram

class BankAccount (var accountHolder : String, var balance : Double) {

    private var transactionHistory = mutableListOf<String>()

    fun deposit (amount : Double) {
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")

    }

    fun withdraw (amount: Double) {
        if (amount <= balance) {
            balance -= amount
            transactionHistory.add(("$accountHolder withdraw $$amount"))}
        else println("Balance not enough")



    }

    fun displayTransactionHistory(){
        println("Transaction History from $accountHolder's Account")

        for (transaction in transactionHistory) {
            println(transaction)
        }
    }

}