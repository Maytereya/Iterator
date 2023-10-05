package org.Iterator.lesson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        studyGroupTest();

    }

    public static void studyGroupTest() {
        StudyGroup g1 = new StudyGroup("physics", "12.2026", 229L);
        StudyGroup g2 = new StudyGroup("math", "12.2026", 129L);
        StudyGroup g3 = new StudyGroup("bio", "12.2026", 984L);
        StudyGroup g4 = new StudyGroup("literature", "12.2026", 765L);
        StudyGroup g5 = new StudyGroup("physics", "12.2026", 227L);
        StudyGroup g6 = new StudyGroup("math", "12.2026", 123L);
        StudyGroup g7 = new StudyGroup("bio", "12.2026", 954L);
        StudyGroup g8 = new StudyGroup("literature", "12.2026", 165L);
        StudyGroup g9 = new StudyGroup("literature", "12.2026", 565L);

        List<StudyGroup> studyGroupList1 = List.of(new StudyGroup[]{g1, g2, g3, g4});
        List<StudyGroup> studyGroupList2 = List.of(new StudyGroup[]{g5, g6, g7, g8, g9});
        StudyGroupIterator studIter1 = new StudyGroupIterator(studyGroupList1);
        StudyGroupIterator studIter2 = new StudyGroupIterator(studyGroupList2);
        while (studIter1.hasNext()) {
            System.out.println(studIter1.next());
        }
        System.out.println("=========== ===========");
        while (studIter2.hasNext()) {
            System.out.println(studIter2.next());
        }
        System.out.println("=========== Сравнение групп ===========");
        Stream s2 = new Stream(studyGroupList2);
        Stream s1 = new Stream(studyGroupList1);
        StreamComparator sc = new StreamComparator();
        int result = sc.compare(s1, s2);
        if (result == 0)
            System.out.println("Группы равны " + result);
        if (result < 0)
            System.out.println("Вторая группа больше чем первая " + result);
        else
            System.out.println("Первая группа больше чем вторая " + result);



    }

    public static void test1() {
        Student student0 = new Student("1", "2", "3в", "52.13.98", 93L);
        Student student1 = new Student("М", "2В", "3а", "42.11.98", 94L);
        Student student2 = new Student("Ы", "2П", "3в", "13.12.98", 95L);
        Student student3 = new Student("Ч", "2ПЭЭ", "3к", "42.12.98", 96L);
        Teacher teacher = new Teacher("Teacher", "2ПЭЭ", "3eк", "11.12.88", 963L);
        List<Student> studentList = List.of(new Student[]{student3, student1, student2, student0});
        StudentGroupIterator sgi = new StudentGroupIterator(studentList);
        //sgi.next();
        //sgi.remove();
        //  sgi.zeroCounter();
        StudentGroup studentGroup = new StudentGroup(studentList, teacher);
//        for (Student i : studentGroup
//        ) {
//            System.out.println(i);
//        }
//        while (sgi.hasNext()) {
//            System.out.println(sgi.next());
//        }
    }

    public static void test3() {
        Student student0 = new Student("1", "2", "3в", "52.13.98", 93L);
        Student student1 = new Student("М", "2В", "3а", "42.11.98", 94L);
        Student student2 = new Student("Ы", "2П", "3в", "13.12.98", 95L);
        Student student3 = new Student("Ч", "2ПЭЭ", "3к", "42.12.98", 96L);
        //Teacher teacher = new Teacher("Teacher", "2ПЭЭ", "3eк", "11.12.88", 963L);
        List<Student> studentList = new ArrayList<>(List.of(new Student[]{student3, student1, student2, student0}));
        for (Student i : studentList) {
            System.out.println(i);
        }
        Collections.sort(studentList);
        System.out.println("+++++++++++++++++");
        for (Student j : studentList) {
            System.out.println(j);
        }
    }
}