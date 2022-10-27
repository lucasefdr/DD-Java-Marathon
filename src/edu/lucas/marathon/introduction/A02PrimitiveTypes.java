package edu.lucas.marathon.introduction;

public class A02PrimitiveTypes {

    public static void main(String[] args) {
        // int, long, double, float, char, byte, short, boolean
        int vInt = 24; // 4 bytes
        long vLong = 43243212; // 8 bytes
        double vDouble = 13124.4324; // 8 bytes
        float vFloat = 3123.55F; // 4 bytes
        byte vByte = 123; // 1 byte
        short vShort = 21334; // 2 bytes
        boolean vBoolean = true; // 1 bit
        char vChar = '\u0041'; // 2 bytes - UNICODE

        // casting long to int
        int vCastingLong = (int) 9999999999L;
        System.out.println(vCastingLong); // cortando bits

        // String -> reference type (tipo de referência)
        String vString = "a colorful mind...";
        System.out.println(vString);
    }
}
