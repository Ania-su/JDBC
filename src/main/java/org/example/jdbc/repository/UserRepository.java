package org.example.jdbc.repository;

import org.example.jdbc.model.User;

import java.util.Arrays;
import java.util.List;

public class UserRepository {
    public static List<User> getUser() {
        return Arrays.asList(
                new User(1, "RANDRIANARISOA", "Antsa"),
                new User(2, "ANDRY NY AINA", "Williest"),
                new User(3, "RANDRIANARISOA", "Tokin'Aina"),
                new User(4, "Randriamahefa", "Hasina")
        );
    }
}
