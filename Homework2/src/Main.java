public class Main {
    public static void main(String[] args) {


        Course course1 = new Course(
                "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)",
                1,
                "Engin Demirog",
                0);
        Course course2 = new Course(
                "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)",
                2,
                " Engin Demirog",
                0);
        Course course3 = new Course(
                "Programlamaya Giriş için Temel Kurs",
                3,
                "Murat Aslan",
                90);


        Course[] courses = {course1, course2, course3};
        System.out.println("KURSLAR:");
        System.out.println("------------------------------");
        for (Course course : courses) {
            System.out.println(course.courseName);
        }
        System.out.println("------------------------------");

        Category category1 = new Category(1, "Tümü");
        Category category2 = new Category(2, "Programlama");

        Category[]categories={category1,category2};
        System.out.println("KATEGORİLER:");
        System.out.println("------------------------------");
        for (Category category:categories
        ) {
            System.out.println(category.categoryName);
        }

        CourseService courseService = new CourseService();
        courseService.addToCourses(course1);
        courseService.addToCourses(course2);
        courseService.addToCourses(course3);

    }
}