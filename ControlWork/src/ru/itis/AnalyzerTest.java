package ru.itis;

import org.junit.Test;

public class AnalyzerTest {
    private Analyzer testedAnalyzer = new Analyzer();

    @Test(expected = SyntaxException.class)
    public void test1() {
        String input = "X;";
        testedAnalyzer.analyze(input);
    }

    @Test(expected = SyntaxException.class)
    public void test2() {
        String input = "17;";
        testedAnalyzer.analyze(input);
    }

    @Test(expected = SyntaxException.class)
    public void test3() {
        String input = "X1:R18;Y2:=56;Z:=X1+T2;";
        testedAnalyzer.analyze(input);
    }

    @Test(expected = SyntaxException.class)
    public void test4() {
        String input = "XX;Y2:=56;Z:=X1+D3;";
        testedAnalyzer.analyze(input);
    }

    @Test(expected = SyntaxException.class)
    public void test5() {
        String input = "a;";
        testedAnalyzer.analyze(input);
    }

    @Test(expected = SyntaxException.class)
    public void test6() {
        String input = "22:=56;X3:=X1+X2";
        testedAnalyzer.analyze(input);
    }

    @Test(expected = SyntaxException.class)
    public void test7() {
        String input = "X=15;";
        testedAnalyzer.analyze(input);
    }

    @Test(expected = SyntaxException.class)
    public void test8() {
        String input = "X:=-;";
        testedAnalyzer.analyze(input);
    }

    @Test(expected = SyntaxException.class)
    public void test9() {
        String input = "X:=7+;";
        testedAnalyzer.analyze(input);
    }

    @Test(expected = SyntaxException.class)
    public void test10() {
        String input = "X:=AA;";
        testedAnalyzer.analyze(input);
    }
}
