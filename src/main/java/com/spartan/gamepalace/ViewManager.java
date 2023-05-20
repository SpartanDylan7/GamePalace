package com.spartan.gamepalace;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ViewManager {

    private static Map<View, Parent> cache = new HashMap<>();

    private static Scene scene;

    public static void setScene(Scene scene){
        ViewManager.scene = scene;
    }
//allows you to switch between games/change scenes
    public static void switchTo(View view){
        if(scene == null){
            System.out.println("Scene Was Not Set");
            return;
        }
        try {
            Parent root;
            if (cache.containsKey(view)) {
                root = cache.get(view);
            }else{
                root = FXMLLoader.load(ViewManager.class.getResource(view.getFileName()));
            }
            scene.setRoot(root);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
