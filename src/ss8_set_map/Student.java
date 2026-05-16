package ss8_set_map;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double score;

    public Student() {
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return id == student.id && Double.compare(score, student.score) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, score);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        // compare by core, id
        int resultScore = Double.compare(score, o.score);

        if (resultScore == 0) {
            return Integer.compare(id, o.id);
        }
        return resultScore;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
