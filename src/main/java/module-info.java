module cn.year.jarforthenewyear {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens cn.year.jarforthenewyear to javafx.fxml;
    opens cn.year.jarforthenewyear.control to javafx.fxml;
    exports cn.year.jarforthenewyear.control;
    exports cn.year.jarforthenewyear;
}