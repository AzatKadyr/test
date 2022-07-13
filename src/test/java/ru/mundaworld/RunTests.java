package ru.mundaworld;

import org.junit.Test;

public class RunTests extends FirstTest{

    @Test
    public void RunTest() throws InterruptedException {
        //1.1 Регистрация покупателя
        testRegistr();

        //Удаление созданного покупателя
        deleteuSER();

    }
}
