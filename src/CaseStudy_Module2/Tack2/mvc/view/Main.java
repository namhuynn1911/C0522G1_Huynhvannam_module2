package CaseStudy_Module2.Tack2.mvc.view;

import CaseStudy_Module2.Tack2.mvc.controller.FuramaController;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FuramaController.displayMainMenu();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
