package ru.mundaworld;

import org.junit.Test;

public class RunTests extends FirstTest{

    @Test
    public void RunTest() throws InterruptedException {
        //1.1 Регистрация покупателя
        testRegistr();
        //Выход из аккаунта
        logOutUser();
        //Авторизация пользователя
        authUser();
        //Удаление созданного покупателя
        deleteuSER();

    }
}
