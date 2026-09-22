import java.util.ArrayList;
import java.util.List;

public class AddressBook

{
    private List<BuddyInfo> addressBook;

    public AddressBook(){

        this.addressBook = new ArrayList<BuddyInfo>();

    }


    public void addBuddy(BuddyInfo buddy){

        addressBook.add(buddy);

    }

    public void removeBuddy(BuddyInfo buddy){

        addressBook.remove(buddy);

    }
    public static void main (String[] args){
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Almahdi");
        AddressBook booky = new AddressBook();
        booky.add(buddy);
        booky.remove(buddy);

    }
}
