package ru.mundaworld;

import org.junit.Test;

public class RunTests extends FirstTest{

    @Test
    public void RunTest() throws InterruptedException {
        //1.1 ����������� ����������
        testRegistr();
        //����� �� ��������
        logOutUser();
        //����������� ������������
        authUser();
        //�������� ���������� ����������
        deleteuSER();

    }
}
