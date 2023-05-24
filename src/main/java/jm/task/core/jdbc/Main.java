package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Johnny", "Depp", (byte) 59);
        userService.saveUser("Amber", "Heard", (byte) 37);
        userService.saveUser("Bill", "Gates", (byte) 67);
        userService.saveUser("Elon", "Musk", (byte) 51);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
        Util.closeConnection();
    }
}