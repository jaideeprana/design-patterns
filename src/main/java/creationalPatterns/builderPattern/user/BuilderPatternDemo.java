package creationalPatterns.builderPattern.user;

public class BuilderPatternDemo {
  public static void main(String[] args) {
    User aUser = new UserBuilder("Weapon", "X")
      .age(1000)
      .phone("221-222-223")
      .address("North America").build();
    System.out.println(aUser);

    User anotherUser = new UserBuilder("Super", "Man")
      //No age
      //No phone
      //no address
      .build();

    System.out.println(anotherUser);
  }
}
