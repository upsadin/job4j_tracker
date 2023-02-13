package ru.job4j.bank;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

/** Класс описывает работу просто банковского сервиса по управлению
 * аккаунтами пользователей банка и возможностью совершать денежные
 * переводы
 * @author Pavel U
 * @version 1.0
 */
public class BankService {
    /**
     * карта пользователей системы со списком аккаунта каждого из них
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * метод позволяет добавлять пользователя, если его еще нет в списке
     * @param user, которого добавляем в список пользователей
     */
    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод удаляет пользователя, если такой имеется в списке
     * @param passport, по которому идентифицируем пользователя
     * @return возвращает true, если пользователь удален,
     * или false, если такого пользователя по ключу не нашлось
     */
    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;
    }

    /**
     * Находит пользователя и добавляет ему аккаунт в системе, если такого не имелось
     * @param passport, по которому находит пользователя
     * @param account, который добавляется пользователю, если такого
     * среди его аккаунтов ранее не было
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userAccounts = getAccounts(user);
            if (!userAccounts.contains(account)) {
                userAccounts.add(account);
            }
        }
    }

    /**
     * находит пользователя по паспорту
     * @param passport пользователя, по которому пользователя находит
     * @return возвращает пользователя либо null, если такого не нашлось
     */
    public User findByPassport(String passport) {
/*        User rsl = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = user;
                break;
            }
        }
        return rsl;*/
        return users.keySet().stream()
                .filter(u -> passport.equals(u.getPassport()))
                .findFirst()
                .orElse(null);
    }

    /**
     * метод находит аккаунт по реквизитам конкретного пользователя
     * @param passport пользователя, аккаунт которого ищется
     * @param requisite реквизиты аккаунта, который ищем
     * @return вовзращает найденный аккаунт, либо null, если он не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
/*        Account account = null;
        if (user != null) {
            List<Account> userAccounts = getAccounts(user);
            for (Account acc : userAccounts) {
                if (acc.getRequisite().equals(requisite)) {
                    account = acc;
                    break;
                }
            }
        }
        return account;*/
        if (user != null) {
            return users.get(user).stream()
                    .filter(a -> requisite.equals(a.getRequisite()))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * метод перевода определенной суммы денег
     * с аккаунта одного пользователя на ккаунт другого
     * @param srcPassport - паспорт пользователя - отправителя
     * @param srcRequisite - реквизиты аккаунта отправителя
     * @param destPassport - паспорт получателя
     * @param destRequisite - реквизиты аккаунта получателя
     * @param amount - сумма переводимых денег
     * @return возвращает true, если перевод совершен, либо false, если нет
     * (если кто-то из пользователей не найден, либо их запрашиваемые аккаунты,
     * либо сумма денег на счетах меньше, чем нужно перевести)
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null
                && destAccount != null
                && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance((destAccount.getBalance() + amount));
            rsl = true;
        }
        return rsl;
    }

    /**
     * находит аккаунты пользователя
     * @param user, чьи аккаунты ищем
     * @return аккаунт пользователя или null
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}