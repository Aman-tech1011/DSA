import java.util.PriorityQueue;

public class Priority {

    static class Student implements Comparable<Student> {
        String name;
        int rank;

        Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("Aman", 4));
        pq.add(new Student("Rahul", 2));
        pq.add(new Student("Rohit", 1));
        pq.add(new Student("Vivek", 45));

        while (!pq.isEmpty()) {
            Student s = pq.remove();
            System.out.println(s.name + " " + s.rank);
        }
    }
}