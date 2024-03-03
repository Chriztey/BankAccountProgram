package com.chris.bankaccountprogram

fun main () {

    val chrisBankAccount = BankAccount("Chris", 100.00)
    println(chrisBankAccount.accountHolder)

    chrisBankAccount.deposit(200.00)
    chrisBankAccount.withdraw(amount = 1500.00)
    chrisBankAccount.deposit(300.00)
    chrisBankAccount.withdraw(100.00)
    chrisBankAccount.displayTransactionHistory()

    println("total ${chrisBankAccount.accountHolder}'s balance is ${chrisBankAccount.acctBalance()}")

    val sarahBankAccount = BankAccount("Sarah", 0.0)
    sarahBankAccount.deposit(100.0)
    sarahBankAccount.withdraw(10.0)
    sarahBankAccount.deposit(300.0)
    println("total ${sarahBankAccount.accountHolder}'s balance is $${sarahBankAccount.acctBalance()}")



}