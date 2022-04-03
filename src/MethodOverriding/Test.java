package MethodOverriding;

public class Test {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.getInterest();
        CitiBank citiBank = new CitiBank();
        citiBank.getInterest();
        HdfcBank hdfcBank = new HdfcBank();
        hdfcBank.getInterest();
        Bank bankCitiRef = new CitiBank();
        Bank bankHdfcRef = new HdfcBank();
        bankCitiRef.getInterest();
        bankHdfcRef.getInterest();
    }
}
