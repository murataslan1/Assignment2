public class CourseService {
    public void addToCourses(Course course){
        System.out.println("------------------------------");
        System.out.println(course.courseName+" kurslarınıza başarıyla eklendi!");
        System.out.println(course.courseName+" kursu için ödenen tutar:"+ course.price+"TL");
        System.out.println("------------------------------");
    }

}