package theme;

import java.util.HashSet;
import java.util.Set;

public class JavaLang {

    private static final JavaLang instance = new JavaLang();
    private Set<String> javaLang;

    private JavaLang() {
        javaLang = new HashSet<String>();
        addJavaLangs();
    }

    public static JavaLang getInstance() {
        return instance;
    }

    public Integer size() {
        return javaLang.size();
    }

    private void addJavaLangs() {
        javaLang.add("Appendable");
        javaLang.add("CharSequence");
        javaLang.add("loneable");
        javaLang.add("Comparable");
        javaLang.add("Iterable");
        javaLang.add("Readable");
        javaLang.add("Runnable");
        javaLang.add("Thread.UncaughtExceptionHandle");
        javaLang.add("Boolean");
        javaLang.add("Byte");
        javaLang.add("Character");
        javaLang.add("Character.Subset");
        javaLang.add("Character.UnicodeBlock");
        javaLang.add("Class");
        javaLang.add("ClassLoader");
        javaLang.add("Compiler");
        javaLang.add("Double");
        javaLang.add("Enum");
        javaLang.add("Float");
        javaLang.add("InheritableThreadLocal");
        javaLang.add("Integer");
        javaLang.add("Long");
        javaLang.add("Math");
        javaLang.add("Number");
        javaLang.add("Object");
        javaLang.add("Package");
        javaLang.add("Process");
        javaLang.add("ProcessBuilder");
        javaLang.add("Runtime");
        javaLang.add("RuntimePermission");
        javaLang.add("SecurityManager");
        javaLang.add("Short");
        javaLang.add("StackTraceElement");
        javaLang.add("StrictMath");
        javaLang.add("String");
        javaLang.add("StringBuffer");
        javaLang.add("StringBuilder");
        javaLang.add("System");
        javaLang.add("Thread");
        javaLang.add("ThreadGroup");
        javaLang.add("ThreadLocal");
        javaLang.add("Throwable");
        javaLang.add("Voi");
        javaLang.add("Thread.Stat");
        javaLang.add("ArithmeticException");
        javaLang.add("ArrayIndexOutOfBoundsException");
        javaLang.add("ArrayStoreException");
        javaLang.add("ClassCastException");
        javaLang.add("ClassNotFoundException");
        javaLang.add("CloneNotSupportedException");
        javaLang.add("EnumConstantNotPresentException");
        javaLang.add("Exception");
        javaLang.add("IllegalAccessException");
        javaLang.add("IllegalArgumentException");
        javaLang.add("IllegalMonitorStateException");
        javaLang.add("IllegalStateException");
        javaLang.add("IllegalThreadStateException");
        javaLang.add("IndexOutOfBoundsException");
        javaLang.add("InstantiationException");
        javaLang.add("InterruptedException");
        javaLang.add("NegativeArraySizeException");
        javaLang.add("NoSuchFieldException");
        javaLang.add("NoSuchMethodException");
        javaLang.add("NullPointerException");
        javaLang.add("NumberFormatException");
        javaLang.add("RuntimeException");
        javaLang.add("SecurityException");
        javaLang.add("StringIndexOutOfBoundsException");
        javaLang.add("TypeNotPresentException");
        javaLang.add("UnsupportedOperationExceptio");

        javaLang.add("AbstractMethodError");
        javaLang.add("AssertionError");
        javaLang.add("ClassCircularityError");
        javaLang.add("ClassFormatError");
        javaLang.add("Error");
        javaLang.add("ExceptionInInitializerError");
        javaLang.add("IllegalAccessError");
        javaLang.add("IncompatibleClassChangeError");
        javaLang.add("InstantiationError");
        javaLang.add("InternalError");
        javaLang.add("LinkageError");
        javaLang.add("NoClassDefFoundError");
        javaLang.add("NoSuchFieldError");
        javaLang.add("NoSuchMethodError");
        javaLang.add("OutOfMemoryError");
        javaLang.add("StackOverflowError");
        javaLang.add("ThreadDeath");
        javaLang.add("UnknownError");
        javaLang.add("UnsatisfiedLinkError");
        javaLang.add("UnsupportedClassVersionError");
        javaLang.add("VerifyError");
        javaLang.add("VirtualMachineErro");

        javaLang.add("Deprecated");
        javaLang.add("Override");
        javaLang.add("SuppressWarning");
    }
}
