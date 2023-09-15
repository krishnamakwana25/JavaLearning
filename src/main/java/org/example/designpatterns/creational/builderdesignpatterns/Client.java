package org.example.designpatterns.creational.builderdesignpatterns;

/**
 * is like a lombok library
 */
public class Client {
    public static void main(String[] args) {
        User user = new User.UserBuilder().setId(1).setName("krishna").setEmail("hy@gmail.com").build();
        System.out.println(user);

        User mona = User.UserBuilder.builder()
                .setId(123)
                .setName("Mona")
//                .setEmail("mona@gmail.com")
                .build();
        System.out.println(mona);

    }
}
