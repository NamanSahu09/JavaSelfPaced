class Main
{
    public static void main(String args[])
    {
        Friend friend1 = new Friend("Naman");
        Friend friend2 = new Friend("Ankit");
        Friend friend3 = new Friend("Ajay");
        System.out.println(Friend.numberOfFriends);
        
        Friend.displayFriends();
        
        friend1.displayFriend();
    }
}
class Friend
{
    String name;
    static int numberOfFriends;
    int noOfFriend;
    Friend(String name)
    {
        this.name = name;
        numberOfFriends++;
        noOfFriend++;
    }
    static void displayFriends()
    {
        System.out.println("You have " + numberOfFriends+ " friends");
    }
    void displayFriend()
    {
        System.out.println("You have " + noOfFriend+ " friends");
    }
}