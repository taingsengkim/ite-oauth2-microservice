package kh.edu.istad.platform.customer.domain.entity;

import kh.edu.istad.common.domain.valueobject.Money;

import java.math.BigDecimal;

public class Customer {
    private Money money;
    private Money balance;

    static void main() {
        Money money1 = new Money(BigDecimal.ZERO);
        System.out.println(money1.toString());
    }
}
