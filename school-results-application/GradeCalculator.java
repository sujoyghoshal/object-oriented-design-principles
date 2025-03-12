class GradeCalculator {
    public String calculateGrade(Student student) {
        int totalMarks = 0;
        int subjectCount = student.getSubjects().size();

        if (subjectCount == 0) return "No subjects found";

        for (Subject subject : student.getSubjects()) {
            totalMarks += subject.getMarks();
        }

        double average = totalMarks / (double) subjectCount;

        if (average >= 90) return "A";
        if (average >= 80) return "B";
        if (average >= 70) return "C";
        if (average >= 60) return "D";
        return "F";
    }
}
