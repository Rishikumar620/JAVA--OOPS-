public class Data {
    public static void main(String args[]) {
        System.out.println("Sizes of Data Types:");
        System.out.println("byte:" + (byte) 0 + ",Size: " + Byte.BYTES + " byte");
        System.out.println("short:" + (short) 0 + ",Size: " + Short.BYTES + " bytes");
        System.out.println("int:" + 0 + ",Size: " + Integer.BYTES + " bytes");
        System.out.println("long:" + 0L + ",Size: " + Long.BYTES + " bytes");
        System.out.println("float:" + 0.0f + ",Size: " + Float.BYTES + " bytes");
        System.out.println("double:" + 0.0d + ",Size: " + Double.BYTES + " bytes");
        System.out.println("char:'" + '\u0000' + "',Size:" + Character.BYTES + " bytes");
        System.out.println("boolean: " + false + ",Size: depends on JVM ");
    }
}
