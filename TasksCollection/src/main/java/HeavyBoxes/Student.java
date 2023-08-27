package HeavyBoxes;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private String group;
    public int course;
    private Map<String, Integer> subjectsGradeMap;

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.subjectsGradeMap = new HashMap<>();
    }

    public void addSubjectAndGrade(String subject, int grade) {
        subjectsGradeMap.put(subject, grade);
    }

    public double getAverageGrade() {
        if (subjectsGradeMap.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : subjectsGradeMap.values()) {
            sum += grade;
        }
        return (double) sum / subjectsGradeMap.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Map<String, Integer> getSubjectsGradeMap() {
        return subjectsGradeMap;
    }

    public void setSubjectsGradeMap(Map<String, Integer> subjectsGradeMap) {
        this.subjectsGradeMap = subjectsGradeMap;
    }
}