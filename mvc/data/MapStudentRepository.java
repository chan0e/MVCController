package com.nhnacademy.mvc.data;

import com.nhnacademy.mvc.Interface.StudentRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapStudentRepository implements StudentRepository {

    private Map<String, Student> studentMap = new ConcurrentHashMap<>();

    @Override
    public void save(Student student) {
        studentMap.put(student.getId(), student);

    }

    @Override
    public void update(Student student) {
        if(existById(student.getId())){
            studentMap.put(student.getId(),student);
        }

    }

    @Override
    public void deleteById(String id) {
        if(existById(id)){
            studentMap.remove(id);
        }
    }

    @Override
    public Student getStudentById(String id) {

        if(existById(id)){
            return studentMap.get(id);
        }

        return null;
    }

    @Override
    public List<Student> getStudents() {
        List<Student> list = new ArrayList<>();

        Iterator<String> mapIter = studentMap.keySet().iterator();

        while (mapIter.hasNext()) {
            String key = mapIter.next();
            if (existById(key)) {
                list.add(studentMap.get(key));
            }
        }
        return list;
    }

    @Override
    public boolean existById(String id) {
        Iterator<String> mapIter = studentMap.keySet().iterator();

        while (mapIter.hasNext()) {
            String key = mapIter.next();

            if (key.equals(id)) {
                return true;
            }
        }
        return false;
    }
}
