public class BuddyInfo {


    public BuddyInfo() {

        this.name = "John";
    }

    public BuddyInfo(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String name;
    public static void main(String[] args) {

        BuddyInfo buddyInfo = new BuddyInfo("Homer");

        System.out.println("Hello " + buddyInfo.getName());
    }

    public void hello(){

        System.out.println("Hello");
    }
}

