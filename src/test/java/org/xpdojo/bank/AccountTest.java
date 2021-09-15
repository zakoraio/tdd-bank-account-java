package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void matchInitialBalanceToZero() {

        Account account = new Account();
        assertThat(account.balance).isEqualTo(0);
    }

    @Test
    public void depositAnAmountToIncreaseTheBalance() {

        Account account = new Account();
        assertThat(account.deposit(100)).isEqualTo(100);
    }

    @Test
    public void depositMultipleAmountToIncreaseTheBalance() {

        Account account = new Account();
        assertThat(account.deposit(100)).isEqualTo(100);
        assertThat(account.deposit(200)).isEqualTo(300);
        assertThat(account.deposit(300)).isEqualTo(600);
    }

}
