class SuperMostClass {
    private String privateMessage() {
        return "Private - Super Most Class";
    }

    public String getPrivateMessage() {
        return privateMessage();
    }
}

class SuperClass extends SuperMostClass {
    protected String protectedMessage() {
        return "Protected - Super Class";
    }
}

class SubClass extends SuperClass {
    String defaultMessage() {
        return "Default - Sub Class";
    }
}

public class SubClassObjectDisplay {
    public static void main(String[] args) {
        SubClass obj = new SubClass();


        System.out.println(obj.getPrivateMessage());
        System.out.println(obj.protectedMessage());
        System.out.println(obj.defaultMessage());
    }
}
