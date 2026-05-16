package ss8_set_map;

import java.util.Comparator;

public class ScoreByIdAndScoreStudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int resultScore = Double.compare(o1.getScore(), o2.getScore());

        if (resultScore == 0) {
            return Integer.compare(o1.getId(), o2.getId());
        }
        return resultScore;
    }
}
