module com.breakoutms.luct.reg {
    requires javafx.controls;
    requires javafx.fxml;
	requires org.apache.commons.collections4;
	requires poi;
	requires org.apache.commons.lang3;
	requires lombok;
	requires javafx.graphics;
	requires http.request;
	requires commons.csv;

    opens com.breakoutms.luct.reg to javafx.fxml;
    exports com.breakoutms.luct.reg;
}