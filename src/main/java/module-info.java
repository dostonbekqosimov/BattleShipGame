module org.musab.game {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.musab.game to javafx.fxml;
    exports org.musab.game;
}