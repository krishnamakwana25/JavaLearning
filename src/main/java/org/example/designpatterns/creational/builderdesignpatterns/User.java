package org.example.designpatterns.creational.builderdesignpatterns;

public class User {
    private final int id;
    private final String name;
    private final String email;

    static class UserBuilder{
        public UserBuilder(){
        }
        private int id;
        private String name;
        private String email;

        public UserBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }
        public User build(){
            return new User(this);

        }
        public static UserBuilder builder(){
            return new UserBuilder();
        }
    }

    private User(UserBuilder userBuilder){
        this.id = userBuilder.id;
        this.name = userBuilder.name;
        this.email =userBuilder.email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + this.getId() +
                ", name='" + this.getName()+ '\'' +
                ", email='" + this.getEmail() + '\'' +
                '}';
    }
}
