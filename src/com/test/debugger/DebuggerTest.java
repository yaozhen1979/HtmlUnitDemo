package com.test.debugger;

/**
 * 測試在debug view中, complier code時, 
 * 以Expressions, Display中動態改變程式碼的表示式來做測試.
 * 
 * Expressions:要先wathc相關的運算式和變數來做測試
 * Display:可在Display中, 重新寫測試碼來執行測試.(Ctrl+Shift+D)
 * 
 * @author tony
 *
 */
public class DebuggerTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 0;
        int d = 100;
        c = a + b + 10;
        System.out.println(c + 1);
    }

}
