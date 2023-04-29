public class Main {
    public static void main(String[] args) {

        Post post = new Post();

        post.name = "Иван";
        post.patronymic = "Иванов";
        post.surname = "Иванович";
        post.phone = 9999999999l;
        post.passport = 1234567890;
        post.subscription = true;

        post.birthday = new FormDate();

        post.birthday.day = 29;
        post.birthday.month = 2023;
        post.birthday.year = 04;

    }

}
