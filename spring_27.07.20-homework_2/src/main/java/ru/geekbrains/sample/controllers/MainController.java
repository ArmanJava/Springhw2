package ru.geekbrains.sample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ru.geekbrains.sample.dto.Student;

import java.util.ArrayList;
import java.util.List;


@Controller
public class MainController {
public List<Student> studentList = new ArrayList<>();
public List<Student> st = new ArrayList<>();

   @GetMapping("/")
   public String getIndexPage() {
      return "index";
   }

    @GetMapping("/students")
    public String getStudentPage() {
        //чтобы вывести список студентов нужно добавить бин StudentsRepository положить данные в Model
        return "student";
    }
    @GetMapping("/profile")
    public String getProfilePage() {
        //чтобы вывести список студентов нужно добавить бин StudentsRepository положить данные в Model
        return "profile";
    }
    @PostMapping("/students")
    public String sendForm(@ModelAttribute Student student, Model model) {

        st.add(student);
        model.addAttribute(st);
//        for (Student s : studentList) {
//            if (s.getId().equals(student.getId()));
//            System.out.println(s);
//        }

//        System.out.println(student);
//        System.out.println(studentList);
        return "student";
    }
    @PostMapping("/profile")
    public String sendProfile(@ModelAttribute Student student, Model model) {


//        studentList.add(student);
//        System.out.println(studentList);

        for (Student s : st) {
            if ((s.getId()).equals((student.getId()))) {
                studentList.add(s);
                System.out.println(studentList);

            }
        }
        model.addAttribute(studentList);
//        System.out.println(student);
        return "profile";
    }



}
