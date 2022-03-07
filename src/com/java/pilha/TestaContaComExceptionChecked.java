package com.java.pilha;

public class TestaContaComExceptionChecked {
    public static void main(String[] args) {
        Conta c = new Conta();
        try {
            c.deposita();
        } catch (Exception ex){
            System.out.println(ex.getMessage() + "  Exception tratada!");
        }
    }
}
