package core.basesyntax;

import core.basesyntax.controllers.ConsoleHandler;
import core.basesyntax.dao.BetDao;
import core.basesyntax.dao.BetDaoImpl;
import core.basesyntax.dao.UserDao;
import core.basesyntax.dao.UserDaoImpl;
import core.basesyntax.lib.Injector;

public class Main {
    static {
        try {
            Injector.injectDependency();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ConsoleHandler.handle();
        BetDao betDao = new BetDaoImpl();
        UserDao userDao = new UserDaoImpl();
        System.out.println(betDao.getAll());
        System.out.println(userDao.getAll());
    }
}