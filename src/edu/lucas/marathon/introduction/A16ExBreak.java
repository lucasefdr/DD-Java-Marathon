package edu.lucas.marathon.introduction;

public class A16ExBreak {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição: valorParcela >= 1000
    public static void main(String[] args) {
        var carValue = 50000;

        for (var installments = 1; installments <= carValue; installments++) {
            var installmentValue = carValue / installments;

            if (installmentValue <= 1000) break;

            System.out.println("Installment: " + installments + " - R$ " + installmentValue);
        }

    }
}
